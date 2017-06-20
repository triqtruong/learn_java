import java.util.Arrays;

/**
 * Class created to solve problems of w3resource
 * http://www.w3resource.com/java-exercises/array/index.php
 */
public final class ArrayPractice {

    /**
     * Calculate the average value of {@code values}. {@code values} must not be empty.
     * @param values: given values in array form
     * @return average value of all the member of the array
     */
    public static double avgArray(double[] values){
        double average = 0;
        if ((values == null) || (values.length == 0)) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (double value : values) {
            average += value;
        }
        return average / values.length;
    }
}
