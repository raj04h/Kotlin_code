fun main(){
    Generic<String>("John")
    Generic<Int>(11)

}

class Generic<T> (value:T){

    init{
        println("value: " + value)
        Check(value)
    }
}

fun<T> Check(text:T){
    println("text: " + text)
}