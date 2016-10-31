
class Person(var name: String, var age: Int,var weight: Float) extends Movable {
  this.setName(name)
  val id = Person.newIdNum
  
  def running = {
    if(this.name.equalsIgnoreCase("Adriano")){
        val mode = "fast"
        println(mode)
        mode
    }else{
      val mode = "slow"
      println(mode)
      mode
    }
  }
  
  def this (){
    // This calls the primary constructor defined on the class line
    this("No Name", 0, 0)
  }
  
  // Subclasses can't call this constructor unlike with Java
  def this (name : String){
    
    // This calls the primary constructor defined on the class line
    this("No Name", 0, 0)
    this.setName(name)
  }
  
  def getName() : String = name
  
  def setName(name : String){
      this.name = name
  }
  
  def getAge() : Int = age
  
  def setAge(age : Int) {
    this.age = age
  }
  
  def getweight() : Float = weight
  
  def setWeight(weight : Float) {
    this.weight = weight
  }
  
  def variarPeso(manutencaoPeso : (Float, Person) => Person, kgs: Float, pessoa : Person) = {
    manutencaoPeso(kgs,pessoa)
  }
  
   override def toString() : String = {
    // How to format Strings
    return "%s with the id %d and age %d weights %.2f".format(this.name, this.id, this.age, this.weight)
  }
}

// Object for a class is where you'd define static class variables and functions in Java
object Person {
  private var idNumber = 0
  private def newIdNum = { idNumber += 1; idNumber }
}