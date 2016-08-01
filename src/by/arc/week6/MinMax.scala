package by.arc.week6

object MinMax extends App {
  def minmax(values: Array[Int]): (Int, Int) = values.foldLeft((Int.MaxValue, Int.MinValue)) { case ((min, max), x) =>
    (if (x < min) x else min, if (x > max) x else max)
  }

  println(minmax(Array(1, 2, 3, 4, 5, 6, 7, 8, 9)))

  println(minmax(Array(-3, 8, -1, 7, 2, 6, -9, 4, 7)))

  println(minmax(Array(9, 1, 5, 1, -1, 9, 2, -7, 1, -7)))
}
