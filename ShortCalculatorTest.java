import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShortCalculatorTest {
    private static volatile ShortCalculator shortCalculator = new ShortCalculator();
    
    @Test
    public void testShortAddition(){
        // : Given
        short baseValue = 16384;
        short difference = 7;
        short expectedShort = 16391;
        // : When
        short actualShort = shortCalculator.add(baseValue, difference);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortSubtraction(){
        short baseValue = 16384;
        short difference = 16383;
        short expectedShort = 1;
        
        short actualShort = shortCalculator.subtract(baseValue, difference);
        
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortMultiplication(){
        short multiplicand = 2;
        short multiplier = 1;
        short expectedShort = 2;
        
        short actualShort = shortCalculator.multiply(multiplicand, multiplier);
        
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortDivision(){
        short dividend = 2;
        short divisor = 1;
        short expectedShort = 2;
        
        short actualShort = shortCalculator.divide(dividend, divisor);
        
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortRemainder(){
        short part1 = 9;
        short part2 = 7;
        short expectedShort = 2;
        
        short actualShort = shortCalculator.remainder(part1, part2);
        
        assertEquals(expectedShort, actualShort);
    }
}
