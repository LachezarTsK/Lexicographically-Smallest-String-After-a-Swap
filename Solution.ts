
function getSmallestString(input: string): string {
    const ASCII_ZERO = 48;
    const inputAsArray: string[] = input.split('');

    for (let i = 0; i < inputAsArray.length - 1; ++i) {
        let x = inputAsArray[i].codePointAt(0) - ASCII_ZERO;
        let y = inputAsArray[i + 1].codePointAt(0) - ASCII_ZERO;
        if (x % 2 === y % 2 && x > y) {
            [inputAsArray[i], inputAsArray[i + 1]] = [inputAsArray[i + 1], inputAsArray[i]];
            break;
        }
    }
    return inputAsArray.join('');
};
