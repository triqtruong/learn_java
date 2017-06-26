import java.util.Arrays;

/**
 * Class created to solve problems of w3resource
 * http://www.w3resource.com/java-exercises/array/index.php
 */
public final class ArrayPractice {
    /**
     * Calculate the total sum of {@code values}.
     * @param values: given values in array form
     * @return the total sum of all member in array
     */
    public static double sumArray(double[] values) {
        double sum = 0;
        for (double number : values) {
            sum += number;
        }
        return sum;
    }

    /**
     * Calculate the average value of {@code values}. {@code values} must not be empty.
     * @param values: given values in array form
     * @return average value of all the member of the array
     */
    public static double avgArray(double[] values){
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid input");
        }
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total / values.length;
    }

    public static int countElement(double element, double[] values) {
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid input");
        }
        int amount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == element) {
                amount++;
            }
        }
        return amount;
    }

    public  static int[] searchIndex(double find_value, double[] values) {
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid Inputs");
        }
        int counter = 0;
        int amount = countElement(find_value, values);
        int[] location = new int[amount];
        for (int index = 0; index < values.length; index++) {
            if (values[index] == find_value) {
                location[counter] = index;
                counter++;
            }
        }
        return location;
    }

    public static void main(String[] arg) {
        double[] array = {0, 1, 2, 3, 4, 1, 2};

        ArrayPractice check = new ArrayPractice();
        int[] amount = check.searchIndex(1, array);
        System.out.println(Arrays.toString(amount));
    }
}
