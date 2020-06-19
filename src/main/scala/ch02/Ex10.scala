package ch02

import java.io.File

import com.github.tototoshi.csv.CSVReader

import scala.util.chaining._

/**
 * https://nlp100.github.io/ja/ch02.html#10-%E8%A1%8C%E6%95%B0%E3%81%AE%E3%82%AB%E3%82%A6%E3%83%B3%E3%83%88
 */
object Ex10 {

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    new File(filename)
      .pipe(CSVReader.open)
      .all()
      .length
      .pipe(println)

}
