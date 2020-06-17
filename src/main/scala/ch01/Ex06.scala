package ch01

/**
 * https://nlp100.github.io/ja/ch01.html#06-%E9%9B%86%E5%90%88
 */
object Ex06 {

  val x = Ex05.biGramWithChars("paraparaparadise")
  val y = Ex05.biGramWithChars("paragraph")

  val xSet = x.toSet
  val ySet = y.toSet

  val union = xSet | ySet
  val intersect = xSet & ySet
  val diff = xSet &~ ySet

  val elemSe = union contains "se"

}
