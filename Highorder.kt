fun main() {
    highOrder(printme)
    highAdd(dd)
    HighClass(printme)
}

val printme = {
    println("higheorder_func")
}

val dd = { a: Int, b: Int -> a + b }

val retFunc = { a: Int, b: Int -> "The sum is ${a + b}" }

fun highOrder(func: () -> Unit) {
    func()
}

fun highAdd(addFunc: (Int, Int) -> Int): () -> String {
    println("sum is ${addFunc(5, 6)}")
    return retFunc
}

class HighClass(func: () -> Unit) {
    init {
        func()
    }
}
