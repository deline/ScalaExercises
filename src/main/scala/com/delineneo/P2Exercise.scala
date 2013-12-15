package com.delineneo

import java.util.NoSuchElementException

object P2Exercise {
  def penultimateBuiltIt[T](list: List[T]) : T = {
    list.init.last
  }

  def penultimateRecursive[T](list: List[T]) : T = {
    list match {
      case h :: _ :: Nil => {println( s"*** $list"); h}
      case _ :: tail     => penultimateRecursive(tail)
      case _             => throw new NoSuchElementException
    }
  }
}