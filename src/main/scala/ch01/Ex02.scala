package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#02-%E3%83%91%E3%83%88%E3%82%AB%E3%83%BC%E3%82%BF%E3%82%AF%E3%82%B7%E3%83%BC%E3%83%91%E3%82%BF%E3%83%88%E3%82%AF%E3%82%AB%E3%82%B7%E3%83%BC%E3%83%BC
 */
object Ex02 {

  def run(str1: String = "パトカー", str2: String = "タクシー"): String =
    str1
      .zip(str2)
      .foldLeft("") {
        case (s, (c1, c2)) => s + List(c1, c2).mkString
      }

}
