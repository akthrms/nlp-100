package ch02

import java.io.File

import com.github.tototoshi.csv._

import scala.util.chaining._

object Ex13 {

  implicit object TabCSVFormat extends DefaultCSVFormat {
    override val delimiter: Char = '\t'
  }

  val inputFilename1 = "src/main/scala/ch02/col1.txt"
  val inputFilename2 = "src/main/scala/ch02/col2.txt"
  val outputFilename = "src/main/scala/ch02/col1col2.txt"

  def run(): Unit = {
    val csvReader1 = new File(inputFilename1).pipe(CSVReader.open)
    val csvReader2 = new File(inputFilename2).pipe(CSVReader.open)

    val csvReaderStream1 = csvReader1.toStream
    val csvReaderStream2 = csvReader2.toStream

    val csvWriter = new File(outputFilename).pipe(CSVWriter.open)

    csvReaderStream1
      .zip(csvReaderStream2)
      .foreach {
        case (x :: _, y :: _) => csvWriter.writeRow(List(x, y))
        case _ => throw new Exception
      }

    csvWriter.close()
  }

}
