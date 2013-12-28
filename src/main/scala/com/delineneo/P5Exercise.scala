package com.delineneo

/**
 * User: deline
 * Date: 15/12/2013
 * Time: 4:54 PM
 */
object P5Exercise {

  def reverse[T](list: List[T]): List[T] = {
    list.reverse
  }

  def reverseTailRecursive[T](list: List[T]): List[T] = {
    def reverse[T](reversedList: List[T], currentList: List[T]): List[T] = currentList match {
      case Nil =>  reversedList
      case h :: tail => reverse(h :: reversedList, tail)
    }
    reverse(Nil, list)
  }

  def reverseViaFolding[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]())((reversedList, head) => head :: reversedList)
  }

}
