package LeetCodeOnNumbers;
import java.util.*; 
public class ReverseNumber {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String result="";
if(number%10==number){
    System.out.println(number);
    return;
}
while (number!=0) {
    int lastDigit=number%10;
    result=result+lastDigit;
    number=number/10;
}
System.out.println("the result is "+result);
    }
}
