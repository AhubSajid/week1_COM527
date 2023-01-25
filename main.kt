fun main (args: Array<String>) {
  println("Enter percentage:")
  val a1 = readLine()
  val a = a1?.toInt() ?: 0

  val grade = when(a){   
    in 70..100 -> "A"
     in 60..69 -> "B"
    in 50..59-> "C"
    in 40..49 -> "D"
    in 30..39 -> "E"
    in 0..29 -> "F"
    else -> "invalid percentage!"
  } 
  println(grade)
}
