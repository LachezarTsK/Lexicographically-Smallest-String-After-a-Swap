
using System;

public class Solution
{
    public string GetSmallestString(string input)
    {
        char[] inputAsArray = input.ToCharArray();

        for (int i = 0; i < inputAsArray.Length - 1; ++i)
        {
            int x = inputAsArray[i] - '0';
            int y = inputAsArray[i + 1] - '0';
            if (x % 2 == y % 2 && x > y)
            {
                Swap(inputAsArray, i, i + 1);
                break;
            }
        }
        return string.Join("", inputAsArray);
    }

    private void Swap(char[] inputAsArray, int first, int second)
    {
        char temp = inputAsArray[first];
        inputAsArray[first] = inputAsArray[second];
        inputAsArray[second] = temp;
    }
}
