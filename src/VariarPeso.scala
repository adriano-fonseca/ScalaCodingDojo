
class VariarPeso {
  
}

object VariarPeso {
  def Emagrecer(kgs: Float, pessoa: Person)  = {
    pessoa.setWeight(pessoa.getweight()-kgs)
    pessoa
  }
  
  def Engordar(kgs: Float, pessoa: Person) = {
    pessoa.setWeight(pessoa.getweight()+kgs)
    pessoa
  }
}