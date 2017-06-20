import java.util.Arrays;

/**
 * Class created to solve problem 1 of w3resource: sorting numeric and string arrays
 * http://www.w3resource.com/java-exercises/array/index.php
 */
public final class ArrayPractice {

    public static void main(String arg[]){
        int[] array1  = {0,1,3,2,5,6,1,8,9};
        String array2 [] = {"ab","abc","bcd","acd"};

        ArrayPractice check = new ArrayPractice();
        System.out.println("Array before sorting: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Array before sorting: " + Arrays.toString(array1));
        System.out.println("Array before sorting: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Array before sorting: " + Arrays.toString(array2));
    }

}
