
public class ShortCalculator {
    /*Adds short together, converts to integers while adding
    casts back to short when complete*/
    public Short add(short baseValue, short difference) {
        return (short) (baseValue + difference);
    }
    
    /*Subtracts shorts, converts to integers while adding
     * casts back to short when complete*/
    public Short subtract(short baseValue, short difference) {
        return (short) (baseValue - difference);
    }
    
    /*Multiplys shorts, converts to integers while multiplying
     * casts back to short when complete*/
    public Short multiply(short multiplicand, short multiplier) {
        return (short) (multiplicand * multiplier);
    }
    
    /*Divides shorts, converts to integers while dividing
     * casts back to short when complete*/
    public Short divide(short dividend, short divisor) {
        return (short) (dividend / divisor);
    }
    
    /*Gets the remainder from 2 parts*/
    public Short remainder(short part1, short part2) {
        return (short) (part1 % part2);
    }
}