package com.delineneo

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit.Test

/**
 * User: deline
 * Date: 15/12/2013
 * Time: 1:28 PM
 */
class P3ExerciseTest extends AssertionsForJUnit {

  @Test
  def builtIn() {
    val list = List(2, 5, 1, 6)
    var result = P3Exercise.nthElement(list, 3)
    assertEquals(6, result)

    result = P3Exercise.nthElement(list, 2)
    assertEquals(1, result)
  }

  @Test
  def recursive() {
    val list = List(2, 5, 1, 6)
    var result = P3Exercise.nthElementRecursive(list, 1)
    assertEquals(5, result)

    result = P3Exercise.nthElementRecursive(list, 2)
    assertEquals(1, result)
  }

}
