package atomickotlin.ch02
import kotlin.math.PI as circleRatio

fun main () {

    objectIsEverywhere()
    makeClass()
    constructor()
    package_()
}

// 16.
fun objectIsEverywhere() {

    // IntRange
    val n = IntRange(0, 10)
    println(n)
    println(n.sum())

    // String
    val s = "Kotlin"
    println(s.reversed())

}

// 17.
class Hippo // 클래스 본문 생략가능
class Bear
class Dog {
    fun bark() = "yip!"
}

fun makeClass() {
    val h1 = Hippo()
    val h2 = Hippo()
    val b = Bear()
    val d = Dog()
    println(h1)
    println(h2)
    println(b)
    println(d.bark())
    exception_()
    list_()
    useVarage()
    set_()
    map_()
}

// 19.
class NormalParam(param: String){
    val str = "input : $param"
}

class ValParam(val param: String){
    val str = "input : $param"
}

class VarParam(var param: String){
    val str = "input : $param"
}

fun constructor() {
    val n = NormalParam("normal")
    val v = ValParam("val")
    val va = VarParam("var")
    // normal
    println(n.str)
    //println(n.param) // compile error

    // val
    println(v.str)
    println(v.param)

    // var
    println(va.str)
    println(va.param)
    va.param = "var2" // 가변 프로퍼티는 대입도됨
}

// 21.
fun package_() {
    println(circleRatio)
    println(kotlin.math.PI)
}

// 23.
fun throwSomeException() {
    throw Exception("This is exception")
}

fun capture(body: () -> Unit) {
    try {
        body()
    } catch (e: Exception) {
        println("Exception captured")
    }
}

fun exception_() {
    capture {
        throwSomeException()
    }
}

// 24.
fun list_() {
    // 타입추론
    var ints = listOf(1, 2, 3)
    println("list_ : " + ints[2])
    println("list_ : " + ints.sum())

    // 타입명시
    //val numbers: List<Int> = listOf("1", 2, 3) // compile error
    var numbers = listOf("1", 2, 3)
    println("list_ : " + ints[0])
    //val num: Int = numbers[0] // compile error
    //val num: Int = numbers[0] as Int // runtime error

    // += 연산자
    //numbers.add(4) // compile error
    var mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(4)
    mutableNumbers += 4
    mutableNumbers += listOf(5, 6)
    ints += 4 // 내부적으로 새로 리스트 만들어서 추가함. 비권장.

}

// 25.
fun vararg_(vararg args: Int) {
    for (i in args) {
        print("$i ")
    }
    println()
}

fun useVarage() {
    vararg_(1, 2, 3)

    val array = intArrayOf(4, 5, 6)
    //val array = arrayOf(4, 5, 6) // 파람으로 넘기면 compile error
    vararg_(*array) // array는 항상 가변인자이므로, 스프레드 연산자를 사용
    // *스프레드 연산자 : 배열 또는 반복 가능한 객체를 '펼쳐서' 함수 인자로 전달하는 연산자

    vararg_(7, *array, 8)
}

// 26.
fun set_() {
    val set = setOf(1, 2, 3, 1, 2, 3)
    println(set)
    println(set.contains(1))
    println(set.contains(4))
    println(set.union(setOf(3, 4)))

    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(4)
    mutableSet += 5
    println(mutableSet)
}

// 27.
fun map_() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println("map.keys : " + map.keys) // [1, 2, 3] => Set
    println("map.values : " + map.values) // [one, two, three]
    println(map[1])
    println(map[4])
    map + (4 to "four") // 새로운 맵을 만들어서 반환 (map은 변경되지 않음)
    //map += 5 to "five" // compile error

    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    mutableMap += 5 to "five"
    println(mutableMap) // {1=one, 2=two, 3=three, 4=four, 5=five}
}

// 28.
