class Loop{
    companion object{
        @JvmStatic

        fun main(args:Array<String>){

            var num=10

            for (i in 0..10){
                println("Number is ${num++}" )
            }

            for (i in 10 downTo 0){
                println("decreasing Num is "+ num--)
            }
            for (i in 0 until 10){
                println("num is ${num++}")
            }
            for (i in 10 downTo 0 step 2){
                println("step2 num is  ${num++}")
            } 

            while (num<40){
                println("when num is $num ")
                num++
            }

            do { 
                println("do_while num is ${num++}")
            }
            while (num<50)


            var (i, j) =Pair('A',true) //A is character
            println("$i $j")

            var(x,y,z)=Triple("boy",false,786) // boy is string
            println("$x $y $z")

            val name=Triple("Ram", "Laxman", "Sita")
            println(name.first)
        }

    }
}