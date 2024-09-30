import java.lang.*;
import java.util.*;

public class LangUtilDemo {

    public static void main(String[] args) {
        System.out.println("Demonstrating java.lang and java.util classes:");

        // java.lang.String
        testStringMethods();

        // java.util.Date
        testDateMethods();

    }


    static void testStringMethods() {
        String str = "Hello World";
        System.out.println("\nTesting java.lang.String:");
        System.out.println("1. length(): " + str.length());
        System.out.println("2. charAt(6): " + str.charAt(6));
        System.out.println("3. substring(6): " + str.substring(6));
        System.out.println("4. toUpperCase(): " + str.toUpperCase());
        System.out.println("5. equals(\"Hello World\"): " + str.equals("Hello World"));
    }

    static void testDateMethods() {
        Date date = new Date();
        System.out.println("\nTesting java.util.Date:");
        System.out.println("1. toString(): " + date.toString());
        System.out.println("2. getTime(): " + date.getTime()); //Milliseconds since epoch
        //Other methods require more setup for meaningful demonstration.
        System.out.println("3-5.  Further Date methods require more elaborate examples (omitted for brevity)");

    }

}
