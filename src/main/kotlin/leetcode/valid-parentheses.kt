package leetcode

fun main() {

    println(isValid("()")); // true
    println(isValid("()[]{}")); // true
    println(isValid("(]")); // false
    println(isValid("([)]")); // false
    println(isValid("{[]}")); // true

}

fun isValid(s: String): Boolean {

    // runtime 비교
    // char : 176ms
    // int : 164ms
    val open = listOf('('.code, '{'.code, '['.code)
    val close = listOf(')'.code, '}'.code, ']'.code)
    val stack = ArrayDeque<Int>()

    for (char in s) {

        val e = char.code

        if (e in open)
            stack.addLast(e)
        else {
            if (stack.isEmpty()) return false;
            val idx = close.indexOf(e)
            if (open[idx] != stack.removeLast()) return false;
        }

    }

    return stack.isEmpty();

}