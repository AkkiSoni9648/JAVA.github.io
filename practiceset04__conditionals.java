import java.util.Scanner;
public class practiceset04__conditionals {
    public static void main(String[] args) {
        //question 02
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your physics marks");
        m1= sc.nextByte();
        System.out.println("Enter your maths marks");
        m2 =sc.nextByte();
        System.out.println("Enter your chemistry marks");
        m3 =sc.nextByte();
        float avr = (m1+m2+m3)/3.0f;
        if (avr>=40 && m1>33 && m2>33 && m3>33) {
            System.out.println("congrats , you are promoted");
        }
         else{
             System.out.println("sorry, you are not promoted");
        }


         //Question 03
        float Tax =0;
         float income =3.3f;
                 if(Tax<2.5){
                     Tax= Tax +0;

                 }
                 if (Tax>2.5f && Tax<=5.0f){
                     Tax = Tax + 0.05f*(income-2.5f);
                 }

    }
    }

