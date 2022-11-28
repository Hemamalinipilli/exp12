package exp12.exp12;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	 App p = new App();
         assertEquals("Hello hema malini", p.getMessage("hema malini"));

     }
     @Test
     public void testNameEmpty() {

         App c = new App();
         assertEquals("Please provide a name!", c.getMessage(" "));

     }
}

