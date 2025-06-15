    
//Bitwise operators are extremly fast and efficient than decimal operators
//Bitwise operators are used to perform bit-level operations on integers
//Bitwise operatoes: XOR, AND, OR, NOT, LEFT SHIFT, RIGHT SHIFT
//Bit 0 and 1

//BITWISE AND
// 0 & 0 = 0
// 0 & 1 = 0
// 1 & 0 = 0
// 1 & 1 = 1

//BITWISE OR
// 0 | 0 = 0
// 0 | 1= 1
// 1 | 0 =1
// 1 | 1 =1

//BITWISE NOT 
// ~0 = 1
// ~1 = 0

//BITWISE XOR
// 0 ^ 0 = 0
// 0 ^ 1 = 1
// 1 ^ 0 = 1
// 1 ^ 1 = 0

// in the odd number the last bit is always 1 and for even it is 0
// 1 = 0001
// 2 = 0010
// 3 = 0011

package NumberSystems;

import java.util.*;

public class BitwiseOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a&b =" + (4 & 3)); // output = 0
        System.out.println("a|b =" + (4 | 3)); // output = 7
        System.out.println("a|b =" + (4 ^ 3)); // output = 7

        // Each varible is represented in 4 bytes which is equivalent to 32 bits
        // so for the negative numbers the first digit is 1
        // 4 = 0000 0000 0000 0000 0000 0000 0000 0100
        // -4 = 1111 1111 1111 1111 1111 1111 1111 1100
        // when the compiler tries to print it wil see the first number when it will be
        // one
        // it will consider it as a negative number and will take the second complment
        // of it and then it wil print the number
        // How to find second compliment
        // 1. Find the first compliment by flipping the bits
        // 2. Add 1 to the first compliment

    }

}
