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

    /**
     * Find the locations of {@code find_value} in {@code values}.
     * @param findValue: the value needs to be found
     * @param values: given values in array form
     * @return the location of the value
     */
    public static int[] searchIndex(double findValue, double[] values) {
        int[] locations = new int[values.length];
        int counter = 0;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == findValue) {
                locations[counter++] = index;
            }
        }
        return Arrays.copyOf(locations, counter);
    }
}
