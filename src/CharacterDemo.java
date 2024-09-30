public class CharacterDemo {

    public static void main(String[] args) {
        char myChar = 'A';

        Character myCharacterObject = Character.valueOf(myChar);

        System.out.println("Demonstrating Character Class Methods:");

        System.out.println("charValue(): " + myCharacterObject.charValue());

        System.out.println("isUpperCase(): " + Character.isUpperCase(myChar));

        System.out.println("isLowerCase(): " + Character.isLowerCase(myChar));

        System.out.println("toUpperCase(): " + Character.toUpperCase(myChar));

        System.out.println("toLowerCase(): " + Character.toLowerCase(myChar));

        char digitChar = '5';
        System.out.println("isDigit('5'): " + Character.isDigit(digitChar));

        System.out.println("isLetter('A'): " + Character.isLetter(myChar));

        char whitespaceChar = ' ';
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(whitespaceChar));

        System.out.println("getType('A'): " + Character.getType(myChar));

        System.out.println("toString(): " + myCharacterObject.toString());


        char unboxedChar = myCharacterObject;
        System.out.println("Unboxed char: " + unboxedChar);

        char specialChar = '\u03A9'; // Omega symbol
        System.out.println("isDefined(Ω): " + Character.isDefined(specialChar));
        System.out.println("Unicode code point of Ω: " + (int)specialChar);

    }
}