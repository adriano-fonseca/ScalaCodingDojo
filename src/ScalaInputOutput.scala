import scala.io.StdIn.{readLine, readInt}
import scala.collection.mutable.ArrayBuffer
import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

import java.io.PrintWriter


object ScalaIO {
  def main(args: Array[String]) {
    var numberGuess = 0
    
    do{
      print("Guess a number ")
      numberGuess = readLine.toInt
//      readByte readDouble readByte readShort readLong
    }while(numberGuess != 5)
  printf("You guessed the secret number was %d\n", numberGuess)

  }
}