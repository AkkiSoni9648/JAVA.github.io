public class Tut07_string_methods {
    public static void main(String[] args) {
        String myname = "Akash";
        System.out.println(myname);
        //index =0 1 2 3 4
        //       A k a s h
        int value = myname.length();
        System.out.println(value);

        String lcstring = myname.toLowerCase();
        System.out.println(lcstring);


        String upstring = myname.toUpperCase();
        System.out.println(upstring);

        String nontrimmedstring = "    Harry      ";
        System.out.println(nontrimmedstring.trim());

        System.out.println(myname.substring(3));

        System.out.println(myname.substring(2, 4));

        System.out.println(myname.replace('k', 'z'));

        System.out.println(myname.startsWith("Aka"));

        System.out.println(myname.endsWith("sh"));

        System.out.println(myname.charAt(4));

        System.out.println(myname.indexOf("h"));

        System.out.println(myname.lastIndexOf("a"));

        System.out.println(myname.equals("Akash"));

        System.out.println(myname.equalsIgnoreCase("akash"));
        //new heading = Escape sequence character
        //examples are given below
        System.out.println("my_name_is_akash\\iaminfirstyear");
    }
}