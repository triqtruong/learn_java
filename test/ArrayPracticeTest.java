import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPracticeTest {
    double array_avg(double array[]){
        double result = 0;
        for (int i = 0; i <array.length; i++) {
            result = result + array[i];
        }
        return result = result/array.length;
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }
    @Test
    public void test1() {
        double test_arr1 [] = {1, 2, 3, 4};
        double average = array_avg(test_arr1);
        assertEquals(2.5, average);
    }
    @Test
    public void test2() {
        double test_arr1 [] = {4};
        double average = array_avg(test_arr1);
        assertEquals(4, average);
    }
    @Test
    public void test3() {
        double test_arr1 [] = {4.2};
        double average = array_avg(test_arr1);
        assertEquals(4.2, average);
    }
    @Test
    public void test4() {
        double test_arr1 [] = {4.2, 4.8};
        double average = array_avg(test_arr1);
        assertEquals(4.5, average);
    }
}