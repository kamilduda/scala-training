package isp.scala.practice

object Functions {
  /**
    * @param f1 the first function to apply
    * @param f2 the second function to apply
    * @param xs a collection of integer arguments
    * @return a collection with f1 and f2 applied to every element - f2(f1(x))
    */
  def applyFunctions(f1: Int => Int, f2: Int => Int)(xs: Seq[Int]): Seq[Int] = {
    ???
  }

  /**
    * @param f
    * @param g
    * @param h
    * @return a function that is composed of h(g(f(a)))
    */
  def composeFunctions[A, B, C, D](f: A => B, g: B => C, h: C => D): A => D = {
    ???
  }

}
