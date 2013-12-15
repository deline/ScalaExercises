package com.delineneo

object P1Exercise {

  def lastElementBuiltIn[T](list: List[T]) : T = {
    list.last
  }

  def lastElementRecursive[T](list: List[T]) : T = list match {
      case h :: Nil   => h
      case _ :: tail  => lastElementRecursive(tail)
      case _          => throw new NoSuchElementException
  }
}