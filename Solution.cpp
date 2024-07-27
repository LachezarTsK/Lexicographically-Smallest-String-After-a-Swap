
#include <string>
using namespace std;

class Solution {

public:
    string getSmallestString(string& input)const {
        for (size_t i = 0; i < input.size() - 1; ++i) {
            int x = input[i] - '0';
            int y = input[i + 1] - '0';
            if (x % 2 == y % 2 && x > y) {
                swap(input[i],input[i+1]);
                break;
            }
        }
        return input;
    }
};
