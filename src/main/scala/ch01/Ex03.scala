package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#03-%E5%86%86%E5%91%A8%E7%8E%87
 */
object Ex03 {

  def run(
    str: String = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
  ): Array[Int] =
    str.split(" ").map(_.length)

}
