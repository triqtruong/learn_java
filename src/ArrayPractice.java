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
     * Count quantity of {@code element} in {@code value}. {@code values} must not be empty.
     * @param element: the element to be counted
     * @param values: the values in array form
     * @return quantity of the element
     */
    public static int countElement(double element, double[] values) {
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid input");
        }

        int count = 0;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == element) {
                count++;
            }
        }
        return count;
    }

    /**
     * Remove {@code member} from {@code values}. {@code values} must not be empty and quantity of {@code member}  is 1
     * @param member: the value to be removed
     * @param values: the values in array form
     * @return the new array with the value removed
     */
    public static double[] removeElement(double member, double[] values) {
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid input");
        }

        int count = countElement(member, values);
        if (count != 1) {
            throw new IllegalArgumentException("Invalid input");
        }

        int location = 0;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == member) {
                location = index;
            }
        }
        int length = values.length - 1;
        double[] newValues = new double[length];
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (i != location) {
                newValues[counter] = values[i];
                counter++;
            }
        }
        return newValues;
    }
}
