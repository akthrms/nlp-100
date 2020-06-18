package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#06-%E9%9B%86%E5%90%88
 */
object Ex06 {

  val x: Seq[String] = Ex05.biGramWithChars("paraparaparadise")
  val y: Seq[String] = Ex05.biGramWithChars("paragraph")

  val xSet: Set[String] = x.toSet
  val ySet: Set[String] = y.toSet

  val union: Set[String] = xSet | ySet
  val intersect: Set[String] = xSet & ySet
  val diff: Set[String] = xSet &~ ySet

  val containsSe: Boolean = union contains "se"

}
