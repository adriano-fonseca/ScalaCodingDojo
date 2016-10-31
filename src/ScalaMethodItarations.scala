import scala.collection.mutable.ArrayBuffer

object ScalaCodingDojo {
  def main(args: Array[String]) {
    val numberList = List(1, 2, 3, 4, 5)
    val letters = "ABCDEFGHIJKLMNOPQRSTUVXZ"

//    printLetterFromString(letters)
//    printNumberList(numberList)
//    getEvenNumbers(20).foreach { x => println(x) }
    printNumberUsingNestedFor
  }
  
  def printLetterFromString(letters: String){
    println("Letters in String")
    for (i <- 0 until letters.length()) {
      println(i + "-" + letters(i))
    }
  }
   
  
  def printNumberList(numberList: List[Int]){
    println("Numbers in List")
    for (i <- numberList) {
      println(i)
    }
  }
  
  def getEvenNumbers(limit: Int) : Array[Int] =  {
    println("Even number from 0 to 20")
    var evenListNumbers = for{ i <- 0 to limit
      if (i % 2==0)
   } yield i
    
   var listReturned = new ArrayBuffer[Int]();
   for(i <- evenListNumbers){
        listReturned += i
   }
   listReturned.toArray
  }
  
   def printNumberUsingNestedFor(){
    println("Numbers in List")
    for (i <- 1 to 5; j <- 6 to 10) {
      if(i==5 && j==10){
        return //similar to break
      }
      
      if(j!=8){
        println("pair: "+ i +","+j) //similar to continue
      }
      
      
    }
  }
  
  
}