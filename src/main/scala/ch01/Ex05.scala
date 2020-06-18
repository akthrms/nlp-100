package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#05-n-gram
 */
object Ex05 {

  def biGramWithWords(str: String = "I am an NLPer"): Seq[Array[String]] = {
    val words = str.split(" ")
    (0 to words.length)
      .map {
        from => words.slice(from, from + 2)
      }
      .filter(_.length == 2)
  }

  def biGramWithChars(str: String = "I am an NLPer"): Seq[String] = {
    (0 to str.length)
      .map {
        from => str.slice(from, from + 2)
      }
      .filter(_.length == 2)
  }

}
