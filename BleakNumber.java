//Method to check if a number is Bleak or not.
// A number ‘n’ is called Bleak if it cannot be represented as sum of a 
//positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.

//Not an optimized algo. Complexity -  O(nlogn)


public boolean isBleak(int num) {
    for (int n = 0; n < num; n++) {
        if (numberOfBits(n) + n == num) {
            return false;
        }
    }
    return true;
}

public int numberOfBits(int num) {
    int count = 0;
    while (num != 0) {
        num = num & (num - 1);
        count++;
    }
    return count;
}