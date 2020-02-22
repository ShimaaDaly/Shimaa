import java.util.*;
public class MyHelloWorld {
    public static void main(String[] args) {
        float a, b;
        float result=1;
        char process;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a = input.nextInt();
        System.out.print("Enter your desired operation:'+,-,*,/,%: ");
        process = input.next().charAt(0);
        System.out.print("Enter the second number:");
        b = input.nextInt();
        if (process== '+') { result = a + b;}
        else if (process== '-') { result = a - b;}
        else if (process== '*') { result = a * b;}
        else if (process== '%') { result = a % b;}
        else if (process== '/' && b!=0) { result = a / b;}
        else {
            System.out.println("error..Enter only one operation from the above to get the right result or check the value of b to get the right result for the operation");
         }
        System.out.print(a + " " + process + " " + b + "=" + result);
    }
}
