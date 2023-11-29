package leetcode

fun main() {
    println(romanToInt("III")); // 3
    println(romanToInt("MCMXCIV")); // 1994
}

fun romanToInt(s: String): Int {

    var result = 0;
    val roman = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000);

    for (i in 0 until s.length) {

        println("index: $i")

        if (i  == s.length-1) return result + (roman[s[i]] ?: 0)

        val front = roman[s[i]] ?: 0
        val back = roman[s[i + 1]] ?: 0

        if (front < back)
            result -= front
        else
            result += front


        println("result: $result")

    }

    return result;
}