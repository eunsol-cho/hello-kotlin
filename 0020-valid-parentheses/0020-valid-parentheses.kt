class Solution {
    fun isValid(s: String): Boolean {

        // 40, 41, 123, 125, 91, 93
        val open = listOf('(', '{', '[')
        val close = listOf(')', '}', ']')
        val stack = ArrayDeque<Char>()

        for (e in s) {

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