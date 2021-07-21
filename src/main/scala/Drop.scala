object Drop {
  def main(args: Array[String]) = {
    val list = List(1, 2, 3, 4, 5)
    println(list)
    val result = list.drop(3)
    println(result)
  }
}