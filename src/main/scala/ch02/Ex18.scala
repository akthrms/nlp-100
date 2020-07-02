package ch02

import java.io.File

import com.github.tototoshi.csv._

import scala.util.chaining._

/**
 * https://nlp100.github.io/ja/ch02.html#18-%E5%90%84%E8%A1%8C%E3%82%923%E3%82%B3%E3%83%A9%E3%83%A0%E7%9B%AE%E3%81%AE%E6%95%B0%E5%80%A4%E3%81%AE%E9%99%8D%E9%A0%86%E3%81%AB%E3%82%BD%E3%83%BC%E3%83%88
 */
object Ex18 {

  val DELIMITER = '\t'

  implicit object TabCSVFormat extends DefaultCSVFormat {
    override val delimiter: Char = DELIMITER
  }

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    new File(filename)
      .pipe(CSVReader.open)
      .toStream
      .sortBy {
        case _ :: _ :: z :: _ => -z.toInt
        case _ => throw new Exception
      }
      .map(_.mkString(DELIMITER.toString))
      .foreach(println)

}
