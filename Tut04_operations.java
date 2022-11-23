public class Tut04_operations {
    public static void main(String[] args) {
//      1.  arthmetic  operators
        int a = 4;
        System.out.println(a);
//        %   can work on floats and doubles.
//        e.g = 4.8%1.1 = result in decimal remainder.

//        2. module operators
        int b = 6 % a;
        System.out.println(b);


//        3. assignment operators
        int c = 9;
        c *= 3;
        System.out.println(c);


//       4. comparison operators
        System.out.println(64<8);


//        5.logical operators (&&,||) and logical not (!) is always false
        System.out.println(64>5 || 64>98);
//        logical is true if any one is true .


    }
}
