package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#05-n-gram
 */
object Ex05 {

  def runToWords(str: String = "I am an NLPer", n: Int = 2): Seq[Array[String]] = {
    val strArray = str.split(" ")
    (0 to str.length)
      .toSeq
      .map {
        from => strArray.slice(from, from + n)
      }
      .filter(_.length == n)
  }

  def runToChars(str: String = "I am an NLPer", n: Int = 2): Seq[String] = {
    (0 to str.length)
      .toSeq
      .map {
        from => str.slice(from, from + n)
      }
      .filter(_.length == n)
  }

}
