import scala.io.StdIn.{ readLine, readInt }
import scala.collection.mutable.ArrayBuffer
import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

import java.io.PrintWriter

object PersonProgram {
  def main(args: Array[String]) {

    var p1 = new Person("Adriano", 29, 85)
    var p2 = new Person("Marcelo", 40, 65)
    var p3 = new Person("Themis", 54, 50)
    var p4 = new Person("Tania", 50, 54)
    var p5 = new Person("Cassio", 26, 65)

    val arrayAnalistas = Array(p3, p4)

    println("")
    println("")

    val friends = ArrayBuffer[Person]()
    //    Add item to the next available slot
    friends.+=(p1, p2)
    //    Add item to the next available slot
    friends.++=:(arrayAnalistas)
    //    Add in the index informed
    friends.insert(1, p5)
    //    Remove  Elements Starting  2 elements starti
    //    friends.remove(0,2)
    friends.foreach { x =>
      {
        println(x)
        //more can be added here
      }
    }
    println()

    //Friends That match to condition
    val friendLessThanThirty = for (person <- friends if person.getAge() < 30) yield person

    println("This ones has less than thirty")
    println()

    friendLessThanThirty.map { x =>
      {
        if (x.getName().equalsIgnoreCase("cassio")) {
          x.variarPeso(VariarPeso.Emagrecer, 10, x)
        } else if (x.getName().equalsIgnoreCase("adriano")) {
          x.variarPeso(VariarPeso.Engordar, 10, x)
        }
      }
    }

    for (person <- friendLessThanThirty) {
      println(person)
      person.running
    }
  }

}