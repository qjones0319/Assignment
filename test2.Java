import org.junit.Test;
import static org.junit.Assert.assertEquals

public class SumAverage {

    @Test
    public void TestForNums1() {
        double num1 = 80.0;
        double num2 = 35.0;
        double supposeAvg = (num1 + num2) / 2;
        double avg = SumAverage.Average(num1, num2);
        assertEquals(supposeAvg, avg);

        if(supposeAvg == avg) {
            System.out.println("Test passed :)");
        }
        else {
            System.out.println("Test failed :(");
        }
    }
}