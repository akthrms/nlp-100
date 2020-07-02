package ch02

import java.io.File

import com.github.tototoshi.csv._

import scala.util.chaining._

/**
 * https://nlp100.github.io/ja/ch02.html#19-%E5%90%84%E8%A1%8C%E3%81%AE1%E3%82%B3%E3%83%A9%E3%83%A0%E7%9B%AE%E3%81%AE%E6%96%87%E5%AD%97%E5%88%97%E3%81%AE%E5%87%BA%E7%8F%BE%E9%A0%BB%E5%BA%A6%E3%82%92%E6%B1%82%E3%82%81%E5%87%BA%E7%8F%BE%E9%A0%BB%E5%BA%A6%E3%81%AE%E9%AB%98%E3%81%84%E9%A0%86%E3%81%AB%E4%B8%A6%E3%81%B9%E3%82%8B
 */
object Ex19 {

  implicit object TabCSVFormat extends DefaultCSVFormat {
    override val delimiter: Char = '\t'
  }

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    new File(filename)
      .pipe(CSVReader.open)
      .toStream
      .groupBy(_.head)
      .map {
        case (name, names) => (name, names.size)
        case _ => throw new Exception
      }
      .toList
      .sortBy(-_._2)
      .foreach {
        case (name, count) => println(s"$count $name")
      }

}
