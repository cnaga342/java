// Description
// . You are given a number, stored in a variable with the name numbe
// r . Perform the following operations on the value stored in the nu
// mber

// 1. Multiply the value by 3
// 2. Add 7 after it
// 3. Subtract 10 from it

// After performing all the above operations, print the updated value

// Input
// The first and the only line of the input contains the number, stored in th
// e variable number

// Constraints

// 1 <= N <= 30

// Output
// Print a single integer, denoting the updated value of the number store
// d, after performing all the operations, given in the problem statement

// Sample Input 1 []

// 4

// Sample Output 1

// 9

// Hint

// In the sample test case, the value stored in the variable number is 4.

// . After multiplying the value by 3, the value gets updated to 12

// . After that, we add 7 to it, so the number gets updated to 19

// . Finally, we subtract 10 from it, so the value becomes 9, which is th
// e final output

public static void operationOnNumbers(int number){
    //write your code here
     number=number*3+7-10;
    System.out.println(number);
}
