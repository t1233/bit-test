package inft16.testing.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class StringStackTest {

    @Test
    void newStackIsEmpty() {
    	StringStack stack = new StringStack();
    	assertEquals(0, stack.size());
    	assertTrue(stack.isEmpty());
    }
    
    @Test
    void pushItemOnCreation() {
    	StringStack stack = new StringStack("Ciao");
    	fail("implement me");
    }
    
    @Test
    void pushOneItem() {
    	// Please add a test which pushes one item to the stack
    	fail("implement me");
    }
    
    @Test
    void popOneItem() {
    	// Please add a test which pops one item from the stack
    	fail("implement me");
    }
    
    @Test
    void fillupAndEmptyStack() {
    	// Please add a test which fills up and empties the stack again
    	fail("implement me");
    }
    
}
