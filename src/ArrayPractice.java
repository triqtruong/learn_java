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
    public void line_draw(int length, int width) {
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
     * array_avg(): calculate the average value of the given array
     * @param array: given array
     * @return average value of all the member of the array
     */
    double array_avg(double array[]){
        double result = 0;
        for (int i = 0; i <array.length; i++) {
            result = result + array[i];
        }
        return result = result/array.length;
    }
}
