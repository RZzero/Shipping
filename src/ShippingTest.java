import static org.junit.Assert.*;

import org.junit.Test;

public class ShippingTest {

	@Test
	public void testCalcShipping() {


		Shipping a = new Shipping();
		double test1 = a.CalcShipping("Pc", 9);
		double test2 = a.CalcShipping("Libro", 80);
		double test3 = a.CalcShipping("lIbro ", 120);
		double test4 = a.CalcShipping(" LibrO ", 60);
		double test5 = a.CalcShipping("iPhone", 650);
		double test6 = a.CalcShipping("Jeans", 50);

		assertssEquals(0.45, test1, 0.001);
		assertEquals(0.00, test2, 0.001);
		assertEquals(0.00, test3, 0.001);
		assertEquals(0.00, test4, 0.001);
		assertEquals(5.00, test5, 0.001);
		assertEquals(3.50, test6, 0.001);

	}

}
