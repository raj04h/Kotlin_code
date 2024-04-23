

class Constructor constructor(val a:Int){ // constructor key iss optional
    var num=10

    fun Add(a:Int, b:Int):Int{
        return a+b
    }

    init{
        println("a_value is "+a)  
    }

    constructor(a:Int, b:Int): this(a){

        val sum=a+b

        println("Addition is "+sum)
    }

    constructor(a:Int, b:Int, c:Int):this(a, b) {

        val tri_sum=a+b+c
        println("tri_sum is "+tri_sum)
    }
}


fun main(){
    println("num is "+Constructor(8,7,6).num)  // 1st time a=8
    println("sum is "+ Constructor(6,4,4).Add(9,4)) //2nd time a=6
}