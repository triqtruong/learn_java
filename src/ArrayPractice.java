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
     * Remove {@code member} from {@code values}
     * @param member: the value to be removed
     * @param values: the values in array form
     * @return the new array with the value removed
     */
    public static double[] removeElement(double member, double[] values) {
        double[] newValues = new double[values.length];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != member) {
                newValues[index++] = values[i];
            }
        }
        return Arrays.copyOf(newValues,index);
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


    /** Reversing the {@code values}.
     * @param values the values to be reversed.
     * @return the reversed values.
     */
    public static double[] reverseIndex(double[] values) {
        double[] reversed = new double[values.length];
        for (int index = 0; index < values.length; index++) {
            reversed[index] = values[values.length - index - 1];
        }
        return reversed;
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
