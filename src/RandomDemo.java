import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random random = new Random(); //Creates a new Random object using the current time as seed.

        System.out.println("Demonstrating Random Class Methods:");

        // 1. nextInt(): Returns a pseudorandom integer.
        int randomNumberInt = random.nextInt(); //Generates a random integer between -2,147,483,648 and 2,147,483,647
        System.out.println("1. nextInt(): " + randomNumberInt);

        // 2. nextInt(int bound): Returns a pseudorandom integer between 0 (inclusive) and bound (exclusive).
        int randomNumberIntBound = random.nextInt(100); //Generates a random integer between 0 and 99
        System.out.println("2. nextInt(100): " + randomNumberIntBound);

        // 3. nextLong(): Returns a pseudorandom long integer.
        long randomNumberLong = random.nextLong();
        System.out.println("3. nextLong(): " + randomNumberLong);

        // 4. nextFloat(): Returns a pseudorandom float between 0.0 and 1.0.
        float randomNumberFloat = random.nextFloat();
        System.out.println("4. nextFloat(): " + randomNumberFloat);

        // 5. nextDouble(): Returns a pseudorandom double between 0.0 and 1.0.
        double randomNumberDouble = random.nextDouble();
        System.out.println("5. nextDouble(): " + randomNumberDouble);

        // 6. nextGaussian(): Returns a pseudorandom double with a Gaussian (normal) distribution.
        double randomNumberGaussian = random.nextGaussian();
        System.out.println("6. nextGaussian(): " + randomNumberGaussian);

        // 7. nextBoolean(): Returns a pseudorandom boolean value.
        boolean randomNumberBoolean = random.nextBoolean();
        System.out.println("7. nextBoolean(): " + randomNumberBoolean);


        // 8. setSeed(long seed): Sets the seed of the random number generator.
        random.setSeed(12345L); //Setting a specific seed for reproducibility
        System.out.println("8. Seed set to 12345. nextInt(): " + random.nextInt(10));

        // 9. Using nextBytes() to generate random bytes into a byte array.
        byte[] byteArray = new byte[5];
        random.nextBytes(byteArray);
        System.out.print("9. nextBytes(): ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        //10.  Illustrating multiple Random objects for different streams of random numbers.
        Random random2 = new Random(); //Different seed than the first random object
        System.out.println("10. Second Random object nextInt(10): " + random2.nextInt(10));


        //Bonus -  Illustrating the use of nextInt with a range other than 0 to bound.
        int min = 50;
        int max = 100;
        int randomInRange = random.nextInt(max - min + 1) + min; // Generates a random integer between min and max (inclusive)
        System.out.println("Bonus: Random number between 50 and 100: " + randomInRange);
    }
}