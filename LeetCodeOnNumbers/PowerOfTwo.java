package LeetCodeOnNumbers;
import java.util.*;
public class PowerOfTwo {
 public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Emter a number");
    int number=scanner.nextInt();
    while (number!=0) {
        int lastDigit=number &1;
number=number>>1;
if(lastDigit==1 && number!=0){
    System.out.println("The number is not a Power of two");
}
else{
    System.out.println("the number is power of two");
}
    }

 }   
}
