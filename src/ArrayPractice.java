import java.util.Arrays;

/**
 * Class created to solve problem 1 of w3resource: sorting numeric and string arrays
 * http://www.w3resource.com/java-exercises/array/index.php
 */
public final class ArrayPractice {
    /**
     * line_draw() - draw a line using input parameter
     * @param length: input length
     * @param width: input width
     */
    public void lineDraw(int length, int width) {
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < length; i++) {
                System.out.print("-");
                if (i == length - 1) {
                    System.out.printf("%n");
                }
            }
        }
    }

    /**
     * Calculate the average value of {@code values}. {@code values} must be valid and populated.
     * @param values: given values in array form
     * @return average value of all the member of the array
     */
    public static double arrayAvg(double[] values){
        double average = 0;
        if ((values.length != 0) || (values != null)) {
            for (double value : values) {
                average += value;
            }
            return average / values.length;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
