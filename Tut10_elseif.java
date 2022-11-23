import java.util.Scanner;
public class Tut10_elseif {
    public static void main(String[] args) {
int age;
        System.out.println("Enter your age ");
        Scanner sc= new Scanner(System.in);
        age =sc.nextInt();
        switch(age){
            //here switch case control instruction starts
            // switch case jaha match hoga uske baad ke saare case print kar deta hai  isiliye hum break key used karte hai taaki ek hi print ho .
            case 18:
                System.out.println("you are going to adult ");
                break;
            case 23:
                System.out.println("you are going to join a job ");
                break;
            case 32:
                System.out.println("you are going to be commiitteed ");
                break;
            default:
                System.out.println("Enjoy your life ");}

                System.out.println("thanks harry bhaiya fot this amaznig course");

        // here is the elseif case


        if(age>50) {
            System.out.println("you are experianced");
        }
        else if(age>40){
            System.out.println("you are semi experianced");

        }
        else if (age>30) {
            System.out.println("you are beginner");}

        }
    }

