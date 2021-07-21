object Scan {
    def main(args: Array[String]) = {
      val list = List(1, 2, 2 ,4)
      val list1 = list.scan(0)(_ + _)
      println(list1)
    }
  }


