package atomickotlin.ch01

fun main() {

    // 03. Hello World
    println("Hello World!")

    // 04. var & val
    var a = 1
    val b = 2
    a = 3
    //b = 4 // compile error

    // type inference
    var data = 5.6 + 6
    println(data) // 11.6 -> Double

    // 05. dataType
    var n: Int = 1
    var p: Double = 1.0

    stringTemplate()
    loop3()
    loop4()

}

// 06. function
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// void
fun returnNoting(a: Int, b: Int): Unit {

}

fun returnNoting2(a: Int, b: Int) {

}

// 한줄 함수
fun oneLine(a: Int, b: Int): Int = if (a > b) a else b

// return type inference
fun oneLine2(a: Int, b: Int) = if (a > b) a else b
// compile error : 타입추론은 한줄 함수만 가능
/*fun returnTypeInference(a: Int, b: Int) {
    return if (a > b) a else b
}*/

// 08. 문자열 템플릿
fun stringTemplate() {
    val name = "Kotlin"
    println("Hello $name")
    // println("Hello $name2") // compile error
    println("Hello" + name)
    println("Hello ${name.length}")
    println("Hello ${1+1}")
}

// 12. 루프와 범위
fun loop1() {
    for (i in 1..10) {
        //
    }
}

fun loop2() {
    for (i in 1 until 10) {
        //
    }
}

fun loop3() {
    println("loop3")
    for (i in 1..10 step 2) {
        println(i)
    }
}

fun loop4() {
    println("loop4")
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun intProgression(r: IntProgression) {
    for (i in r) {
        println(i)
    }
}

fun loop5() {
    intProgression(1..10)
    intProgression(1 until 10)
    intProgression(10 downTo 1)
    intProgression(10 downTo 1 step 2)
}

// 13. in keyword
fun inKeyword() {
    val list = listOf(1, 2, 3)
    println(1 in list)
    println(1 !in list)

    val values = 1..3
    for (v in values) {
        println(v)
    }

    val v = 2
    if (v in values) {
        println("$v is a memeber of $values")
    }
}