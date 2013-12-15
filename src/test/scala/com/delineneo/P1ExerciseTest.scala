package com.delineneo

import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._

class P1ExerciseTest extends AssertionsForJUnit {

  @Test def builtIn() {
    val aList = List(1, 2, 3, 4, 5)
    val result = P1Exercise.lastElementBuiltIn(aList)
    assertEquals(5, result)
  }

  @Test def recursive() {
    val aList = List(1, 2, 3, 4, 5)
    val result = P1Exercise.lastElementRecursive(aList)
    assertEquals(5, result)
  }
}