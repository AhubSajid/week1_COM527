fun main (args: Array<String>) {
  println("Enter your name:")
  val n = readLine()

  println("How many times would you like it printed:")
  val t1 = readLine()
  val t = t1?.toInt() ?: 0
  
  for (i in 0 until t) {
    println(n)
  }
}