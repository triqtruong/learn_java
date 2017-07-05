import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.sort;
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
    public void removeElement_multipleValues() {
        double[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        double[] new_values = ArrayPractice.removeElement(2, values);
        double[] expected = {0, 1, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, new_values);
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
    public void searchIndex_multipleElements() {
        double[] values = {0, 1, 2, 3, 4, 1, 2};
        int[] indexLocation = ArrayPractice.searchIndex(1, values);
        int[] expected = {1, 5};
        assertArrayEquals(expected, indexLocation);
    }

    @Test
    public void insertIndex_oneElement() {
        double[] values = {0};
        double[] newValues = ArrayPractice.insertIndex(2, 0, values);
        double[] expected = {2, 0};
        assertArrayEquals(expected, newValues);
    }

    @Test
    public void insertIndex_multipleElements() {
        double[] values = {0, 1, 2, 3};
        double[] newValues = ArrayPractice.insertIndex(4, 2, values);
        double[] expected = {0, 1, 4, 2, 3};
        assertArrayEquals(expected, newValues);
    }

    @Test
    public void reverseIndex_oneElement() {
        double[] values = {0};
        double[] reversing = ArrayPractice.reverseIndex(values);
        double[] expected = {0};
        assertArrayEquals(expected,reversing);
    }

    @Test
    public void reverseIndex_multipleElement() {
        double[] values = {0, 1, 2, 3, 4, 5};
        double[] reversing = ArrayPractice.reverseIndex(values);
        double[] expected = {5, 4, 3, 2, 1, 0};
        assertArrayEquals(expected, reversing);
    }

    @Test
    public void commonString_multipleElements() {
        String[] strings1 = {"One", "one", "One", "two", "random"};
        String[] strings2 = {"this", "is", "Probably", "One", "almost", "random"};
        String[] common = ArrayPractice.commonString(strings1,strings2);
        String[] expected = {"One", "random"};
        Arrays.sort(common);
        Arrays.sort(expected);
        assertArrayEquals(expected,common);
    }
}