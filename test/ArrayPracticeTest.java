import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPracticeTest {
    @Test
    public void sumArray_multipleValues() {
        double[] values = {1, 2, 3, 4};
        double average = ArrayPractice.sumArray(values);
        assertEquals(10, average);
    }

    @Test
    public void sumArray_oneValue() {
        double[] values = {4};
        double average = ArrayPractice.sumArray(values);
        assertEquals(4, average);
    }
}