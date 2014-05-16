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
  }
  
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
  
}