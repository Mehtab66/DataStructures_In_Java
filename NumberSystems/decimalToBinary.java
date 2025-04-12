package NumberSystems;

import java.util.*;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int number = scanner.nextInt();
        String result = "";
        while (number > 0) {
            int remainder = number % 2;
            result = remainder + result;
            number = number / 2;
        }
        System.out.print(result);

        // Most effiecent way to find if a number is even or odd

        System.out.println("Enter a number ");
        int num = scanner.nextInt();
        if ((num & 1) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("Number is Odd");
        }

    }

}
