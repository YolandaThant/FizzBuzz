public class Multiples {
    public static void main(String[] args) {
        // Task 4: Multiples of 3 and 5

        // We're looking for non-negative multiples of 3 or 5.
        // The 1st four are 3, 5, 6, & 9, so there are 4 below 10. How many are below 1000?
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count ++;
            }
        }
        System.out.println("Non-negative multiples of 3 or 5: " + count);
    }
}
