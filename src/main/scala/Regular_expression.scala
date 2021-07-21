import scala.util.matching.Regex
object Regular_expression {
    def main(args: Array[String]) {
      val Name = new Regex("(E|e)niya")
      val str = "Eniya is eniyakumar "

      println((Name findAllIn str).mkString(","))
    }
  }


