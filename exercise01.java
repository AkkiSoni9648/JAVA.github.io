import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
//        Question 01
        int num1 = 9;
        int num2 = 7;
        int num3 = 6;
        int sum = num1+num2+num3;
        System.out.println(sum);


//        Question 02
        float subject1 = 75;
        float subject2 = 80;
        float subject3 = 70;
        float cgpa =(subject1+subject2+subject3)/30;
        System.out.println(cgpa);


//        Question 03
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day");


//        Question 04
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
