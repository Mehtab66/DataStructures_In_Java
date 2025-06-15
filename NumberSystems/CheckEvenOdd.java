    package NumberSystems;

import java.util.*;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scanner.nextInt();
        if ((num & 1) == 1) {
            System.out.print("The number is odd");
        } else {
            System.out.print("The number is even");
        }

    }

}
