package PaqueteDePrueba

object TechnicalProof {
  
  val answerList: List[String] = List("")
  
  def main(args: Array[String]): Unit = {
  	//val inputString = "[1,[2,3,4,5,6,7],[8,null],[null],[null,1]]"//"[1,[2,3,null,4],[null],5]"
  	val input = List(1,List(2,3,null,4),List(null),5)//List(1, List(2, 3, 4, 5, 6, null, 7), 8)
  	val answer1 = FlattenArray.flattenArray(input)
    val answer2 = PigLatin.pigLatin("smile")
  	println(answer1)
    println(answer2)
  }
  
}