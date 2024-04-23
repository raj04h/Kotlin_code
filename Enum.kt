fun main(){
    println("Today is "+Days.Monday)

    for (day in Days.values()){
        
        if(day.holiday ){
            println("holiday= "+day)
        }
    }

    val dir=Direction()
    println("Direction= ${dir.West}")
    println("Direction $dir")  //memory address (e.g., @87aac27)
}

enum class Days(val holiday:Boolean = false){
    Sunday(true), Monday, Tuesday, Wednesday, Thursday, Friday, Saturday(true)
}

class Direction{
     val East = "East"
    val West = "West"
    val North = "North"
    val South = "South"
}
