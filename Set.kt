class Set{
    companion object{
        @JvmStatic

        fun main(args:Array<String>){

            println("SetOf")

            val aset=setOf("12",1.3,"Raj",'r',false)
            println(aset)

            val mset=mutableSetOf("33",1.4,"Raj")
            mset.add(true)
            println(mset)
        }
    }
}