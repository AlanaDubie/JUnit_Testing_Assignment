import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {

    /*
     *   TEST SCENARIO 1
     *   INPUTS: 1, 1
     *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
     */
    @Test
    void Scenario1()
    {
        SumNumbers c = new SumNumbers();
        assertEquals(1,c.sumIsEven(1,1));

    }

    /*
     *   TEST SCENARIO 2
     *   INPUTS: 1, 2
     *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
     */

    @Test
    void Scenario2()
    {
        SumNumbers c = new SumNumbers();
        assertEquals(0,c.sumIsEven(1,2));

    }
}
