//import statement e.g scanneer class
import java.util.Scanner;
public class Tut03_input_from_user {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
//scanner class is given below.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum of A and B");
        System.out.println(sum);


        String str = sc.next();
        System.out.println(str);

    }
}
