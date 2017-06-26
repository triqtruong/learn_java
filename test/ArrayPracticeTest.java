import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPracticeTest {
    @Test
    public void sumArray_multipleValues() {
        double[] values = {1, 2, 3, 4};
        double sum = ArrayPractice.sumArray(values);
        assertEquals(10, sum);
    }

    @Test
    public void sumArray_oneValue() {
        double[] values = {4};
        double sum = ArrayPractice.sumArray(values);
        assertEquals(4, sum);
    }

    @Test
    public void sumArray_emptyArray() {
        double[] values = new double[0];
        double sum = ArrayPractice.sumArray(values);
        assertEquals(0, sum);
    }

    @Test
    public void avgArray_multipleValues() {
        double[] values = {1, 2, 3, 4};
        double average = ArrayPractice.avgArray(values);
        assertEquals(2.5, average);
    }

    @Test
    public void avgArray_oneValue() {
        double[] values = {4};
        double average = ArrayPractice.avgArray(values);
        assertEquals(4, average);
    }

    @Test
    public void countElement_oneElement() {
        double[] values = {2};
        int amount = ArrayPractice.countElement(2,values);
        assertEquals(1,amount);
    }

    @Test
    public void countElement_multipleElements() {
        double[] values = {0, 1 , 2, 3, 1, 2, 1};
        int amount = ArrayPractice.countElement(1, values);
        assertEquals(3, amount);
    }

    @Test
    public void searchIndex_multipleElements() {
        double[] values = {0, 1, 2, 3, 4, 1, 2};
        int[] indexLocation = ArrayPractice.searchIndex(1, values);
        int[] expected = {1, 5};
        assertArrayEquals(expected, indexLocation);
    }
}