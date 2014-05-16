package example

import common._

object Lists {

  /**
   * P01 (*) Find the last element of a list.
   * Example:
   * scala> last(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 8
   *
   * @param l A list of integers
   * @retun The last element of the list 'l'
   * @throws java.util.NoSuchElementException if `l` is an empty list
   */
  def last(l: List[Int]): Int = {
    if (l.isEmpty) throw new java.util.NoSuchElementException("NoSuchElementException")
    else if (l.tail.isEmpty) l.head
    else last(l.tail)
  }

  /**
   * P02 (*) Find the last but one element of a list.
   * Example:
   * scala> penultimate(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 5
   *
   * @param l A list of integers
   * @retun The penultimate element of the list 'l'
   * @throws java.util.NoSuchElementException if `l` is an empty list
   */
  def penultimate(l: List[Int]): Int = {
    if (l.isEmpty) throw new java.util.NoSuchElementException("NoSuchElementException")
    else if (l.tail.tail.isEmpty) l.head
    else penultimate(l.tail)
  }
}
