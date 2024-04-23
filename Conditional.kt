class Conditional{
    companion object{

        @JvmStatic

        fun main(args: Array<String>){

            var num=21
            var msg: String
 
            if (num>100){
                println("num is greater than 100")
            }
            else if (num<30) {
                println("num is less than 30")
            }
            else 
                println("num is smaller than 100")


            msg=if (num>100) "num is greater than 100" else "num is smaller than 100"

            println(msg)

// Switch statement is When Statement
            when {
                num >100 -> {
                    println("num is greater than 100")

                }

                num <30 ->{

                    println("num is smaller than 30")

                }

                else -> { println("num is smaller than 100") }
            }
        }
    }
}