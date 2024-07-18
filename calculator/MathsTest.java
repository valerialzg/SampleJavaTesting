package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;

public class MathsTest {
	
	private final Maths math = new Maths();

	@Test
	public void addSuccessfulTest() {
		assertEquals("add() Test succesful 1",(Double) 5.0,(Double) math.add(3, 2));
	}
	@Test
	public void addFailedTest() {
		assertNotEquals("add() Test succesful 2",(Double) 5.7,(Double) math.add(3, 2));
	}
	
	@Test
	public void subtractSuccessfulTest() {
		assertEquals("subtract() Test succesful 1",(Double) 1.0,(Double) math.subtract(3, 2));
	}
	@Test
	public void subtractFailedTest() {
		assertNotEquals("subtract() Test succesful 2",(Double) 5.7,(Double) math.subtract(3, 2));
	}
	
	@Test
	public void multiplySuccessfulTest() {
		assertEquals("multiply() Test succesful 1",(Double) 6.0,(Double) math.multiply(3, 2));
	}
	@Test
	public void multiplyFailedTest() {
		assertNotEquals("multiply() Test succesful 2",(Double) 5.7,(Double) math.multiply(3, 2));
	}
	@Test
	public void divideSuccessfulTest() {
		assertEquals("divide() Test succesful 1",(Double) 2.0,(Double) math.divide(6, 3));
	}
	@Test
	public void divideFailedTest() {
		assertNotEquals("divide() Test succesful 2",(Double) 5.7,(Double) math.multiply(3, 2));
	}
	@Test
	public void powerSuccessfulTest() {
		assertEquals("power() Test succesful 1",(Double) 8.0,(Double) math.power(2, 3));
	}
	@Test
	public void powerFailedTest() {
		assertNotEquals("power() Test succesful 2",(Double) 5.7,(Double) math.multiply(3, 2));
	}

}
