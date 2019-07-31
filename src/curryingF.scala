

object curryingF {        //declare the object for scala
  def add(x:Int, y:Int) = x + y   //define currying function
  def add1(x:Int)=(y:Int)=> x + y  //define currying function
  def add2(x:Int)(y:Int)= x + y  //define currying function
  def main(args:Array[String])
  {
    println(add(13, 55))  //13+55 display 68
    println(add1(13)(55)) //13+55 display 68
    val sum = add1(13)   //13 is x 
    println(sum(55))   //55 is y so sum = 13 + 55
    val sum1 = add2(13)_  //13_ representation as x + y so 13 is x
    println(sum1(55))  //55 is y and it is going to replace _ and display 68
  }
}