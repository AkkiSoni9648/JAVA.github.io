public class practiceset03__strings {
    public static void main(String[] args) {

        //question no. 01
        String name = ("AKash");
        System.out.println(name.toLowerCase());

        //question no. 02
        String myclass = ("      I am in first year    ");
        System.out.println(myclass.replace(" ", "_"));

        //problem 03
        String letter =("Dear <name>, thanks a lot .");
        letter = letter.replace("<name>","Akash");
        System.out.println(letter);

        //question 04
        String mystring =("heyyy how  are you   where are you going ");
        System.out.println(mystring.indexOf(" "));
        System.out.println(mystring.indexOf("  "));

        //question 05
        String newone =("Dear akash \n\t you are doing great job \n\t thank you. ");
        System.out.println(newone);
    }
}