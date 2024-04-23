
fun main(){
    
    var name: String? = "John Smith"
    name?.let {
        println("name is "+ it)
        println("length of name is "+it.length)
        println("reversed name= " +it.reversed())
        
    }
    

    val user: User?= User()

    val msg: String? = user?.run {
        println("name is $name")
        "Run Scope Function"
    }
    

    println("msg= " + msg)

    
    val ser=User().apply{
        name="John"
        age=18
        mobNo="34423244"

    }
    val age= with(ser){
        println("name: " + name)
        age 

    }
        println("age: " + age)

        /*
        user.also{
            it.name = "Johny"
            println("name has been changed")
        }
        println("new_name: " + user.name)

        */
}

class User{
    var name:String="John"

    var age:Int=0

    var mobNo:String="2345567"
}