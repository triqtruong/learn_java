import java.util.Arrays;

/**
 * Class created to solve problem 1 of w3resource: sorting numeric and string arrays
 * Goal: implementing sort function without using built-in functions
 * http://www.w3resource.com/java-exercises/array/index.php
 */
public final class ArrayPractice {
    enum sort {CHECK_STATE,REARRANGE_STATE};
    enum status {CHECK, PASS};
    enum run_status {INIT, RUN};

    public int[] sorting_num_max2min(int array[]) {
        int buffer = 0;
        int swap_location = 0;
        sort cur_sorting_state = sort.REARRANGE_STATE;
        status cur_status = status.CHECK;
        run_status chk_stat = run_status.INIT;
        run_status rearrange_stat = run_status.INIT;

        while(cur_status == status.CHECK) {
            switch (cur_sorting_state) {
                case REARRANGE_STATE:
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > array[swap_location]) {                              // Look for larger number to swap places
                            buffer = array[i];
                            array[i] = array[swap_location];
                            array[swap_location] = buffer;
                            swap_location = i;
                        }
                    }
                    cur_sorting_state = sort.CHECK_STATE;
                    break;
                case CHECK_STATE:
                    chk_stat = run_status.INIT;                                             // Set/Reset status
                    for (int check = 0; check < array.length; check++) {                    // Check and compare every member
                        for (int i = 0; i < array.length; i++) {
                            if (chk_stat == run_status.INIT) {                              // Find the 1st out of order member
                                if ((i > check) && (array[i] > array[check])) {
                                    cur_sorting_state = sort.REARRANGE_STATE;
                                    swap_location = check;                                  // save location
                                    chk_stat = run_status.RUN;
                                    i = array.length;                                       // break loop
                                    check = array.length;
                                }
                            }
                        }
                    }
                    if (cur_sorting_state == sort.CHECK_STATE) {
                        cur_status = status.PASS;
                    }
                    break;
                default:
                    cur_sorting_state = sort.CHECK_STATE;
                    break;
            }
        }
        return array;
    }
    public static void main(String arg[]){
        int[] array1  = {0,1,3,2,5,6,1,8,9};
        String array2 [] = {"ab","abc","bcd"};

        ArrayPractice check = new ArrayPractice();
        System.out.println("Array before sorting: " + Arrays.toString(array1));
        System.out.println("Array before sorting: " + Arrays.toString(check.sorting_num_max2min(array1)));
    }

}
