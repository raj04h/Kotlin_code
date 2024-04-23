fun main(){

    val taskname: String="Downloaded  tasks"
    val Taskmanager= TaskManager(Bgtask(taskname),Bgexecute(taskname))

    println(Taskmanager)

}  

interface Task{ 
    fun Create()
}

interface ExecuteTask{
    fun Execute()
}

class Bgtask(val taskName:String):Task{
    override fun Create(){
        println("Bgtask "+ taskName + " created")
    }
}

class Bgexecute(val taskName:String):ExecuteTask{
    override fun Execute(){
        println("Bgtask "+ taskName + " executed")
    
    }

}

class TaskManager(val creator: Task, val executor: ExecuteTask):Task by creator ,ExecuteTask by executor 

/* {

    override fun Create(){
        creator.Create()

    }
    override fun Execute(){
        executor.Execute()
    }
}
*/