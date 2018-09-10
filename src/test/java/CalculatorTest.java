import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}
	Calculations c=new Calculations();
	@Test
	public void testadd() 
	{
		
		double x=c.add(100, 200);
		assertEquals(300, x, x);
	}
	
    public void testsub()
    {
    	double y=c.sub(50, 30);
		assertEquals(20, y, y);
    }
    
    public void testmul()
    {
    	double z=c.mul(4, 5);
    	assertEquals(20, z, z);
    }
    
    public void testdiv()
    {
    	double v=c.div(30, 6);
    	assertEquals(5, 5, v);
    }
	
	
}
