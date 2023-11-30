class Solution {
    fun isValid(s: String): Boolean {

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
}