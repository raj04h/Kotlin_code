class List{
    companion object {
        @JvmStatic

        fun main(args: Array<String>) {
            println("Welcome")

            val alist=listOf("a", "bus", 1,2.0,false,listOf(1,2,3))
            println(alist)

            val mlist=mutableListOf<Any>("Ram", "sam")

            mlist.add(0,"Ramanujan")
            mlist.add("Ramiz")
            mlist.add(1)

            val nlist=mutableListOf("Pawan",false)
            mlist.addAll(nlist)
            println(mlist)

        }
    }
}