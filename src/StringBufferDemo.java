public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Demonstrating StringBuffer Class Methods:");

        // 1. append(): Appends a string to the end.
        sb.append(" World!");
        System.out.println("1. append(): " + sb);

        // 2. insert(): Inserts a string at a specified index.
        sb.insert(6, "Beautiful ");
        System.out.println("2. insert(): " + sb);

        // 3. delete(): Deletes characters within a specified range.
        sb.delete(6, 15); //Deletes "Beautiful "
        System.out.println("3. delete(): " + sb);

        // 4. reverse(): Reverses the string.
        sb.reverse();
        System.out.println("4. reverse(): " + sb);

        // 5. replace(): Replaces characters within a specified range.
        sb.replace(0, 5, "World");
        System.out.println("5. replace(): " + sb);


        // 6. length(): Returns the length of the string.
        System.out.println("6. length(): " + sb.length());

        // 7. capacity(): Returns the current capacity.
        System.out.println("7. capacity(): " + sb.capacity());

        // 8. charAt(): Returns the character at a specified index.
        System.out.println("8. charAt(0): " + sb.charAt(0));

        // 9. setCharAt(): Sets the character at a specified index.
        sb.setCharAt(0, 'H');
        System.out.println("9. setCharAt(): " + sb);

        // 10. substring(): Returns a substring.
        System.out.println("10. substring(0, 5): " + sb.substring(0, 5));


        //Bonus -  Illustrating ensureCapacity()
        sb.ensureCapacity(100); //Increases capacity if needed, does nothing if already sufficient
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        //Bonus - More StringBuffer Methods (Illustrative)
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Test");
        System.out.println("toString(): " + sb2.toString()); //Converts to String
        sb2.deleteCharAt(1); //Deletes a character at a specific index
        System.out.println("After deleteCharAt(1): " + sb2);

    }
}