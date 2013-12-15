package com.delineneo

/**
 * User: deline
 * Date: 15/12/2013
 * Time: 1:26 PM
 */
object P3Exercise {
  def nthElementRecursive[T](list : List[T], position : Int) : T = (position, list) match {

    case (0, h :: _   ) => h
    case (position, _ :: tail) => nthElementRecursive(tail, position - 1)
    case (_, Nil) => throw new NoSuchElementException
  }

  def nthElement[T](list: List[T], position: Int): T = {
    list(position)
  }

}
