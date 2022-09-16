import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {

    Balanced balancedBrack = new Balanced();
    String balancedPar = "(Sana)";
    String unbalancedBrackets = "{hello";
    String balancedBracketsandPar = "{(Sana)}";


    @Test
    public void testBalancedBracketsTest_balancedPar(){
        assertTrue(balancedBrack.balancedParentheses("(Sana)"));
    }
    @Test
    public void testBalancedBracketsTest_unbalancedBrackets(){
        assertFalse(balancedBrack.balancedBrackets("{(hello}"));
    }
    @Test
    public void testBalancedBracketsTest_balancedBracketsandPar(){
        assertTrue(balancedBrack.balancedBrackets("{(Sana)}"));
    }
}
