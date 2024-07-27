
public class Solution {

    public String getSmallestString(String input) {
        char[] inputAsArray = input.toCharArray();

        for (int i = 0; i < inputAsArray.length - 1; ++i) {
            int x = inputAsArray[i] - '0';
            int y = inputAsArray[i + 1] - '0';
            if (x % 2 == y % 2 && x > y) {
                swap(inputAsArray, i, i + 1);
                break;
            }
        }
        return String.valueOf(inputAsArray);
    }

    private void swap(char[] inputAsArray, int first, int second) {
        char temp = inputAsArray[first];
        inputAsArray[first] = inputAsArray[second];
        inputAsArray[second] = temp;
    }
}
