package ch02

import java.io.File

import com.github.tototoshi.csv.CSVReader

import scala.util.chaining._

/**
 * https://nlp100.github.io/ja/ch02.html#14-%E5%85%88%E9%A0%AD%E3%81%8B%E3%82%89n%E8%A1%8C%E3%82%92%E5%87%BA%E5%8A%9B
 */
object Ex14 {

  def run(n: Int, filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    new File(filename)
      .pipe(CSVReader.open)
      .toStream
      .take(n)
      .foreach(_.mkString.pipe(println))

}
