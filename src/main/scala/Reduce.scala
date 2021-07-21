object Reduce {
    def main(args: Array[String]) = {
      val list = List(1, 2, 3 ,4)
      val result = list.reduce(_ + _)
      println(result)
    }
  }

