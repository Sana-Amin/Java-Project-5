import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class BalancedBracketsParameterizedTest {
    private String input;
    private boolean expectedOutput;
    Balanced balancedBrack = new Balanced();

    public BalancedBracketsParameterizedTest (String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }
    @Parameters
    public static Collection<Object[]> tests(){
        String balancedPar = "(Sana)";
        String unbalancedBrackets = "{hello";
        String balancedBracketsandPar = "{(Sana)}";

        Object[][] expectedOutputs ={
                {balancedPar, true},
                {unbalancedBrackets, false},
                {balancedBracketsandPar, true},
        };
        return Arrays.asList(expectedOutputs);
    }
    @Test
    public void testBalancedBrackets() {
        assertEquals(expectedOutput, balancedBrack.balancedBrackets(input));
    }

}
