
class Solution {
    
    fun getSmallestString(input: String): String {
        val inputAsArray = input.toCharArray()

        for (i in 0..<inputAsArray.size - 1) {
            val x = inputAsArray[i] - '0'
            val y = inputAsArray[i + 1] - '0'
            if (x % 2 == y % 2 && x > y) {
                swap(inputAsArray, i, i + 1)
                break
            }
        }
        return inputAsArray.joinToString("")
    }

    private fun swap(inputAsArray: CharArray, first: Int, second: Int) {
        val temp = inputAsArray[first]
        inputAsArray[first] = inputAsArray[second]
        inputAsArray[second] = temp
    }
}
