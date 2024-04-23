

import Myclass
class Myclass {

    var someInt:Int=10 //object created

    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            println("your class is made")

            println("Add_fun  is ${Add(5,8)}")
            println("another sum is " +Add(34,221))


            val kb=Myclass()
            println("someInt value " +kb.someInt)
        }

        fun Add(a:Int, b:Int):Any{
            return a+b
        }


    }
}