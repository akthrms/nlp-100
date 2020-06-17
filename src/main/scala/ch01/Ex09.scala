package ch01

import scala.util.Random

/**
 * https://nlp100.github.io/ja/ch01.html#09-typoglycemia
 */
object Ex09 {

  def run(
    str: String = "I couldn’t believe that I could actually understand what I was reading : the phenomenal power of the human mind ."
  ): String = {
    val r = """^(.)(.{3,})(.)$""".r
    str
      .split(" ")
      .map {
        case r(x, y, z) => x + Random.shuffle(y) + z
        case s@_ => s
      }
      .mkString(" ")
  }

}
