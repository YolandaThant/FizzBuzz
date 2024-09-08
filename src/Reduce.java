public class Reduce {
    public static void main(String[] args) {
        //    Task 5: Reduce a number to 0

        /* Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
        For example, if you start with n = 2, the answer is 2.
        Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0
        Write a main method that prints how many steps it takes to reach 0 if you start at 100. */

        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}
