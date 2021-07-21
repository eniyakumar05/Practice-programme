object Fold {
    def main(args: Array[String]) = {
      val list = List(1, 2, 3 ,4)
      val result = list.fold(0)(_ + _)
      println(result)
    }
}

