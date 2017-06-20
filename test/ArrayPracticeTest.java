import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPracticeTest {
    @Test
    public void test() {
        double array [] = {1, 2, 3, 4};
        double average = ArrayPractice.arrayAvg(array);
        assertEquals(2.5, average);
    }

    @Test
    public void testOneValue() {
        double array [] = {4};
        double average = ArrayPractice.arrayAvg(array);
        assertEquals(4, average);
    }
}