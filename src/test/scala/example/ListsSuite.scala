package example

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Lists._

@RunWith(classOf[JUnitRunner])
class ListsSuite extends FunSuite {

  trait TestSets {
    val l = List(1, 1, 2, 3, 5, 8)
  }
  
  test("last: on simple list") {
    new TestSets {
      assert(last(l) === 8)
    }
  }
  
}