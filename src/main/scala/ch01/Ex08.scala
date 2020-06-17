package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#08-%E6%9A%97%E5%8F%B7%E6%96%87
 */
object Ex08 {

  def cipher(str: String): String =
    str
      .toCharArray
      .map {
        c => if (c.isLower) (219 - c.asInstanceOf[Int]).toChar else c
      }
      .mkString

}
