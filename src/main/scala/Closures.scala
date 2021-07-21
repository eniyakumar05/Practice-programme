object Closures {
    def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(5) )
      println( "multiplier(2) value = " +  multiplier(6) )
    }
    var factor = 5
    val multiplier = (i:Int) => i * factor
  }


