package ch02

import java.io.File

import com.github.tototoshi.csv._

import scala.util.chaining._

object Ex12 {

  implicit object TabCSVFormat extends DefaultCSVFormat {
    override val delimiter: Char = '\t'
  }

  val outputFilename1 = "src/main/scala/ch02/col1.txt"
  val outputFilename2 = "src/main/scala/ch02/col2.txt"

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit = {
    val csvWriter1 = new File(outputFilename1).pipe(CSVWriter.open)
    val csvWriter2 = new File(outputFilename2).pipe(CSVWriter.open)

    new File(filename)
      .pipe(CSVReader.open)
      .toStream
      .foreach {
        case x :: y :: _ =>
          csvWriter1.writeRow(List(x))
          csvWriter2.writeRow(List(y))
        case _ => throw new Exception
      }

    csvWriter1.close()
    csvWriter2.close()
  }

}
