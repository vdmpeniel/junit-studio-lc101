package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
     //"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    public void balancedNested() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
    }

    @Test
    public void balancedRepeated() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void balanced() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedWithTextBefore() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedEmptyWithTextAfter() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedEmptyString() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedEmpty() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void unbalancedWithText() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void unbalancedWrongDirectionWithTextBefore() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void unbalancedWrongDirection() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }


}
