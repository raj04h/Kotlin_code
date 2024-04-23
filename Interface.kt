fun main(){
    val face=Interface()
    val local = Local()
    println("name: " + local.name + "," + face.name)
    println("sum_two= "+local.Add(2,4)+"," + face.Add(2,4))
    println("sum_three= "+local.Add(2.0f,4.4f,5.9f) + ","+ face.Add(2.0f,4.4f,5.9f))

}

interface Add{

    var name: String
    fun Add(a: Int, b: Int):Int
    fun Add(a: Float, b: Float, c: Float):Float

}

class Local: Add{
    override var name= "Local_cl;ass"

    override fun Add(a: Int, b: Int): Int {
        return a+b+a+b
     }
    override fun Add(a: Float, b: Float, c: Float): Float { 
        return  3*(a+b+c)
    }
}

class Interface:Add{   //constructor
    override var name="Interface_class"

    override fun Add(a: Float, b: Float, c: Float):Float{
        return a + b + c
    }
    override fun Add(a: Int, b:Int):Int{
        return a+b
    }
}