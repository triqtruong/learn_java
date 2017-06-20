import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPracticeTest {
    @Test
    public void arrayAvg_multipleValues() {
        double[] values = {1, 2, 3, 4};
        double average = ArrayPractice.arrayAvg(values);
        assertEquals(2.5, average);
    }

    @Test
    public void arrayAvg_oneValue() {
        double[] values = {4};
        double average = ArrayPractice.arrayAvg(values);
        assertEquals(4, average);
    }
}