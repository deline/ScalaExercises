package com.delineneo

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert._
import com.delineneo.P5Exercise._

/**
 * User: deline
 * Date: 15/12/2013
 * Time: 9:38 PM
 */
class P5ExerciseTest extends AssertionsForJUnit {

  @Test
  def builtIn() {
    var reversed = reverse(List(1, 2, 3, 4, 5))
    assertEquals(List(5, 4, 3, 2, 1), reversed)

    reversed = reverse(List(9, 1, 8, 2))
    assertEquals(List(2, 8, 1, 9), reversed)
  }

  @Test
  def tailRecursive(){
    var reversed = reverseTailRecursive(List(1, 2, 3, 4, 5))
    assertEquals(List(5, 4, 3, 2, 1), reversed)

    reversed = reverseTailRecursive(List(9, 1, 8, 2))
    assertEquals(List(2, 8, 1, 9), reversed)
  }

  @Test
  def usingFolding() {
    var reversed = reverseViaFolding(List(1, 2, 3, 4, 5))
    assertEquals(List(5, 4, 3, 2, 1), reversed)

    reversed = reverseViaFolding(List(9, 1, 8, 2))
    assertEquals(List(2, 8, 1, 9), reversed)
  }
}
