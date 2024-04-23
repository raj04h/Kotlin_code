class Map{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            println("map")

            val amap=mapOf<Any,String>(1 to "Raman",10 to "Rahul",true to "check")
            println(amap)

            val mmap=mutableMapOf<Any,String>(1 to "error",10 to "solvers",true to "correct")

            mmap[1]="What is"
            println(mmap)
        }
    }
}
