object Find {
    def main(args: Array[String]) = {
      val iterator = Iterator(3, 6, 9, 4, 2)
      val result = iterator.find(x=>{x % 3 == 0})
      println(result)
    }
  }

