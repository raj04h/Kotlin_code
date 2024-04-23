fun main(){
    println("square="+sqr(45))
    println("Sum of "+add(2,3))
}


val sqr:(Int)->Int={
    x -> x*x
}
val add:(Int,Int)-> Int={
    x,y -> x+y
}


fun square(a:Int):Int{
    return a*a
}