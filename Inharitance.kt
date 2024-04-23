
open class Parent{
    open var name="parent_class" //open keyword give permision to change value of class

    fun Add(a:Int, b:Int):Int{
        return a + b
    }

    open fun Sub(a:Int, b:Int):Int{
        return a -b
    }
}

class Inharit_class: Parent(){

    override var name="inharit_class" //name changed 

    override fun Sub(a:Int, b:Int):Int{
        val sub=super.Sub(a, b)
        val sqr=sub*sub
        return sqr
    }
}
fun main(){

    val parent= Parent()
    val inharitance=Inharit_class()
    println("name is "+inharitance.name+ ',' +parent.name)
    println("Add_fun is "+inharitance.Add(5,6)+','+parent.Add(3,4))
    println("sqr is "+inharitance.Sub(7,8))
} 

