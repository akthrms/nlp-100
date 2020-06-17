package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#04-%E5%85%83%E7%B4%A0%E8%A8%98%E5%8F%B7
 */
object Ex04 {

  val useHeadIndex = Seq(1, 5, 6, 7, 8, 9, 15, 16, 19)

  def run(
    str: String = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
  ): Map[String, Int] =
    str
      .split(" ")
      .zipWithIndex
      .foldLeft(Map.empty[String, Int]) {
        case (m, (s, i)) => {
          val idx = i + 1
          val until = if useHeadIndex.indexOf(idx) > -1 then 1 else 2
          m + (s.slice(0, until) -> i)
        }
      }

}
