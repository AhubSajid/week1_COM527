class Car (val make: String, val model: String, val capacity: String, val topSpeed: Double) {
  
  
  var currentSpeed: Int

  init{
    currentSpeed = 0
  }

  fun accelerate(a: Int){
    var cs1 = this.currentSpeed
    var cs2 = cs1 + a
    if (cs2 <= this.topSpeed){
      this.currentSpeed += a
    } else {
      println("Sorry you can't accelerate that much")
    }    
  }
  
  fun decelerate(d: Int){
    var ds1 = this.currentSpeed
    var ds2 = ds1 - d
    if (ds2 >= 0){
      this.currentSpeed -= d
    } else {
      println("Sorry you can't decelerate that much")
    } 
  }

  override fun toString() : String {
    return "Car Name: $make $model Engine Capacity: $capacity Top Speed: $topSpeed Current Speed: $currentSpeed"
  }
  
}

fun main (args: Array<String>){
  val mustang = Car("Ford","Mustang","5000cc",162.8)
  val urus = Car("Lamborghini","Urus","4000cc",189.5)
  mustang.accelerate(165)
  urus.accelerate(100)
  urus.decelerate(120)
  println(mustang.toString())
  println(urus.toString())
  
}