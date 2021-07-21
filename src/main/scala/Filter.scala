object Filter {
  def main(args: Array[String]) = {
    val list = List(3, 6, 9, 4, 2)
    println(list)
    val result = list.filter(x=>{x % 3 == 0})
    println(result)
  }
}