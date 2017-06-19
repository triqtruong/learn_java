import java.util.Scanner;

/**
 *  Class created to solve problem 1000 - Timus. Can be tested with console.
 *  Class includes: sum - return result of summation between 2 numbers
 *                  main - console program used to test the sum function
 */
public final class Timus1000 {
    /**
     * Sum() - Adding 2 integers together
     * @param first: first integer to be entered
     * @param second: second integer to be entered
     * @return: integer value of summation
     */
    public int sum(int first, int second) {
        return first + second;
    }

    public static void main(String[] arg) {
        Timus1000 math = new Timus1000();
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println(math.sum(first, second));
        }
    }
}
