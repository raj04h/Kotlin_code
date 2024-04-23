
fun main(){
    val new_instance=New()
    val abstract_instance=Abstraction()
    println("square="+new_instance.Sqr(4))
    println("Substraction="+abstract_instance.Sub(4,3))
}

abstract class Abclass {

    var name: String="abstract_class"
    abstract var branch: String

    fun Add(a:Int, b:Int):Int{
         return a + b
    }

    abstract fun Sub(a:Int, b:Int):Int
}

interface iclass{
    var operator:String

    fun Sqr(a:Int):Int{
        return a*a
    }
}

class Abstraction: Abclass(){

    override var branch= "Abstraction"

    override fun Sub(a:Int,b:Int):Int{
        return a-b
    }
}

class New:iclass{

    override var operator: String = "SET VALUE"
    override fun Sqr(a:Int):Int{
        return a*a
    }

}