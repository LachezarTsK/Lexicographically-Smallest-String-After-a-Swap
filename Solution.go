
package main

import (
    "fmt"
    "reflect"
)

func getSmallestString(input string) string {
    inputAsArray := []byte(input)
    swap := reflect.Swapper(inputAsArray)

    for i := 0; i < len(inputAsArray) - 1; i++ {
        x := inputAsArray[i] - '0'
        y := inputAsArray[i+1] - '0'
        if x % 2 == y % 2 && x > y {
            swap(i, i + 1)
            break
        }
    }
    return string(inputAsArray)
}
