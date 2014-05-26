package example

import common._

object Lists {

  /**
   * P01 (*) Find the last element of a list.
   * Example:
   * scala> last(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 8
   *
   * @param l A list of T
   * @return The last element of the list 'l'
   * @throws java.util.NoSuchElementException if `l` is an empty list
   */
  def last[T](l: List[T]): T = l match {
    case Nil => throw new java.util.NoSuchElementException("NoSuchElementException")
    case h :: Nil => h
    case h :: tail => last(l.tail)
  }

  /**
   * P02 (*) Find the last but one element of a list.
   * Example:
   * scala> penultimate(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 5
   *
   * @param l A list of T
   * @return The penultimate element of the list 'l'
   * @throws java.util.NoSuchElementException if `l` is an empty list
   */
  def penultimate[T](l: List[T]): T = l match {
    case Nil => throw new java.util.NoSuchElementException("NoSuchElementException")
    case h :: tail :: Nil => h
    case h :: tail => penultimate(tail)
  }

  /**
   * P03 (*) Find the Kth element of a list.
   * By convention, the first element in the list is element 0.
   * Example:
   *
   * scala> nth(2, List(1, 1, 2, 3, 5, 8))
   * res0: Int = 2
   *
   * @param n The nth position in the list 'l' to look for the element to return
   * @param l A list of T
   * @return The nth element of the list 'l'
   * @throws java.util.NoSuchElementException if `l` is an empty list or n is 'out of bound'
   */
  def nth[T](n: Int, l: List[T]): T = (n, l) match {
    case (_, Nil) => throw new java.util.NoSuchElementException("NoSuchElementException")
    case (0, h :: _) => h
    case (n, h :: tail) => nth(n - 1, tail)
  }

  /**
   * P04 (*) Find the number of elements of a list.
   * Example:
   * scala> length(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 6
   *
   * @param l A list of T
   * @return The length of the list 'l'
   */
  def length[T](l: List[T]): Int = l match {
    case Nil => 0
    case x :: tail => 1 + length(tail)
  }

  /**
   * P05 (*) Reverse a list.
   * Example:
   * scala> reverse(List(1, 1, 2, 3, 5, 8))
   * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
   *
   * @param l A list of T
   * @return The reverted List[T]
   */
  def reverse[T](l: List[T]): List[T] = l match {
    case Nil => l
    case x :: tail => reverse(tail) ::: List(x)
  }

  /**
   * P06 (*) Find out whether a list is a palindrome.
   * Example:
   * scala> isPalindrome(List(1, 2, 3, 2, 1))
   * res0: Boolean = true
   *
   * @param l A list of T
   * @return Wheter the 'l' is palindrome
   */
  def isPalindrome[T](l: List[T]): Boolean = l match {
    case Nil => true
    case x :: Nil => true
    case x :: tail => if (x == l.last) isPalindrome(tail.init) else false
  }
}













