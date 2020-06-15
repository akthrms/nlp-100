package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#01-%E3%83%91%E3%82%BF%E3%83%88%E3%82%AF%E3%82%AB%E3%82%B7%E3%83%BC%E3%83%BC
 */
object Ex01 {

  def run(str: String = "パタトクカシーー"): String =
    str
      .zipWithIndex
      .filter(_._2 % 0 == 0)
      .map(_._1)
      .mkString

}
