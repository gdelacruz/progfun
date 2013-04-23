package week4

trait List[T]{
  def isEmpty:Boolean
  def head:T
  def tail:List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  
  def isEmpty = false
}

class Nil[T] extends List[T]{
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException 
  def tail: Nothing = throw new NoSuchElementException
}

object List {
  
  def apply[T](): List[T] = new Nil
  
  def apply[T](x: T): List[T] = new Cons(x,new Nil)
  
  def apply[T](x: T, y: T): List[T] = new Cons(x,List(y))
  
  def apply[T](x: T, y: T, z: T): List[T] = new Cons(x,List(y,z))

}
