 import java.util.Arrays;
 import java.util.Collections;


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int max = 0;
        for(int counter = 0; counter < integers.length; counter++){
            if(integers[counter] > max){
                max += integers[counter];
            }
        }
        return max;
    }
    

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max = Collections.max(Arrays.asList(integers));
        return max;
    }
}
