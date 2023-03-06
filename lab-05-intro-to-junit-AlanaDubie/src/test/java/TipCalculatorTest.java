import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TipCalculatorTest
{
    /*   TEST SCENARIO 1
     *   INPUTS: $100.00 bill, 20% tip
     *   EXPECTED OUTPUT: $20.00
     */
    @Test
    void Scenario1()
    {
        TipCalculator c = new TipCalculator();
        assertEquals(20, c.calculateTip(100,20));
    }

    /*   TEST SCENARIO 2
     *   INPUTS: $200.00 bill, 15% tip
     *   EXPECTED OUTPUT: $20.00
     */
    @Test
    void Scenario2()
    {
        TipCalculator c = new TipCalculator();
        assertEquals(30, c.calculateTip(200,15));
    }

}
