package ch02

import java.io.File

import com.github.tototoshi.csv._

import scala.util.chaining._

/**
 * https://nlp100.github.io/ja/ch02.html#17-%EF%BC%91%E5%88%97%E7%9B%AE%E3%81%AE%E6%96%87%E5%AD%97%E5%88%97%E3%81%AE%E7%95%B0%E3%81%AA%E3%82%8A
 */
object Ex17 {

  implicit object TabCSVFormat extends DefaultCSVFormat {
    override val delimiter: Char = '\t'
  }

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    new File(filename)
      .pipe(CSVReader.open)
      .toStream
      .map {
        case x :: _ => x
        case _ => throw new Exception
      }
      .toSet
      .size
      .pipe(println)

}
