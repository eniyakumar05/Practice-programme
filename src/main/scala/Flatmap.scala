object Flatmap {
    def main(args: Array[String]) = {
      val list = List(1, 5, 10)
      val result = list.flatMap{x => List(x,x+1)}
      println(result)
    }
  }


