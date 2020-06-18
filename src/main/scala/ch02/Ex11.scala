package ch02

import java.io.File

import com.github.tototoshi.csv.CSVReader

/**
 * https://nlp100.github.io/ja/ch02.html#11-%E3%82%BF%E3%83%96%E3%82%92%E3%82%B9%E3%83%9A%E3%83%BC%E3%82%B9%E3%81%AB%E7%BD%AE%E6%8F%9B
 */
object Ex11 {

  def run(filename: String = "src/main/scala/ch02/popular-names.txt"): Unit =
    CSVReader
      .open(new File(filename))
      .foreach {
        columns => {
          val replacedColumns = columns.map(_.replace('\t', ' ')).mkString
          println(replacedColumns)
        }
      }

}
