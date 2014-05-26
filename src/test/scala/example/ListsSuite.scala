package example

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Lists._

@RunWith(classOf[JUnitRunner])
class ListsSuite extends FunSuite {

  trait TestSets {
    val empty = List()
    val l = List(1, 1, 2, 3, 5, 8)
    val l1 = List(1, 2, 3, 2, 1)
  }
  
  //P01 (*) Find the last element of a list.
  test("last: on empty list") {
    new TestSets {
      val thrown = intercept[NoSuchElementException] {
        last(empty)
      }
      assert(thrown.getMessage === "NoSuchElementException")
    }
  }
  
  test("last: on simple list") {
    new TestSets {
      assert(last(l) === 8)
    }
  }
  
  //P02 (*) Find the last but one element of a list.
  test("penultimate: on empty list") {
    new TestSets {
      val thrown = intercept[NoSuchElementException] {
        penultimate(empty)
      }
      assert(thrown.getMessage === "NoSuchElementException")
    }
  }
  
  test("penultimate: on simple list") {
    new TestSets {
      assert(penultimate(l) === 5)
    }
  }
  
  //P03 (*) Find the Kth element of a list.
  test("nth: on empty list") {
    new TestSets {
      val thrown = intercept[NoSuchElementException] {
        nth(1, empty)
      }
      assert(thrown.getMessage === "NoSuchElementException")
    }
  }
  
  test("nth: with n greater of list size") {
    new TestSets {
      val thrown = intercept[NoSuchElementException] {
        nth(10, l)
      }
      assert(thrown.getMessage === "NoSuchElementException")
    }
  }
  
  test("nth: on simple list") {
    new TestSets {
      assert(nth(2, l) === 2)
    }
  }
  
  //P04 (*) Find the number of elements of a list.
  test("length: on empty list") {
    new TestSets {
      assert(length(empty) === 0)
    }
  }
  
  test("length: on simple list") {
    new TestSets {
      assert(length(l) === 6)
    }
  }
  
  // P05 (*) Reverse a list.
  test("reverse: on empty list") {
    new TestSets {
      assert(reverse(empty) === empty)
    }
  }
  
  test("reverse: on simple list") {
    new TestSets {
      assert(reverse(l) === l.reverse)
    }
  }
  
  // P06 (*) Find out whether a list is a palindrome.
  test("isPalindrome: on empty list") {
    new TestSets {
      assert(isPalindrome(empty) === true)
    }
  }
  
  test("isPalindrome: on simple list") {
    new TestSets {
      assert(isPalindrome(l) === false)
    }
  }
  
  test("isPalindrome: on complex list") {
    new TestSets {
      assert(isPalindrome(l1) === true)
    }
  }
}