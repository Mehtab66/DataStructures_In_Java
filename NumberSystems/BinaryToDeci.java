package NumberSystems;

import java.util.*;

public class BinaryToDeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number in Decimal is 0");
            return;
        }

        int result = 0;
        int index = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == 1) {
                result += (int) Math.pow(2, index);
            }
            number /= 10;
            index++;
        }

        System.out.println("The number in Decimal is " + result);
    }
}
