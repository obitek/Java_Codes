

public class RandomNumbers_ {
    public static void main(String[] args) {
        // a) Random integer between 20 and 80 (inclusive)
        int randA = (int)(Math.random() * 61) + 20; // 80 - 20 + 1 = 61
        System.out.println("a) A random integer between 20 and 80 (inclusive):\t \t \t" + randA);

        // b) Random integer between -20 and 20 (inclusive)
        int randB = (int)(Math.random() * 41) - 20; // 20 - (-20) + 1 = 41
        System.out.println("b) A random integer between -20 and 20 (inclusive):\t \t" + randB);

        // c) Random integer between -50 and -20 (inclusive)
        int randC = (int)(Math.random() * 31) - 50; // -20 - (-50) + 1 = 31
        System.out.println("c) A random integer between -50 and -20 (inclusive):\t \t" + randC);

        // d) Random float between 0.0 and 21.9999 (inclusive)
        double randD = (int)(Math.random() * 22); // 0.0 to just below 22.0
        System.out.printf("d) A random float between 0.0 and 21.9999 (inclusive):\t%.4f\n", randD);
    }
}


