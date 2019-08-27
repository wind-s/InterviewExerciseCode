package text
fun main(args: Array<String>){
    println("hello world")

    println(test3(2, 4))

    //变量
    val name: String = "winds"
    val name2 = "winds2"
    println(name)
    println(name2)

    //Double
    var double = 7.5e6
    println(double)
}

fun test2(args1: Int, args2: Int): Int{
    return if(args1 > args2) args1 else args2
}

fun test3(args1: Int, args2: Int): Int = if(args1 > args2) args1 else args2

