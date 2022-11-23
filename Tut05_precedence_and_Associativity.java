public class Tut05_precedence_and_Associativity {
//    precedence means pehle kaunsa operations use karo .
    public static void main(String[] args) {
        int a = 6*5- 34/2;
/*       30-34/2
          = 30 - 17
          =13
*/
        System.out.println(a);
        int b = 60/5-8*2;
        /* 12-8*2
           = 12-16
           = -4
         */
        System.out.println(b);
/*       assocoiativity means jab same preference ke order a jaye to kya kare .
        then left to right order follow kare.
         exception =  ++ = right to left
         */
    }
}
