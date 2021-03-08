package tests;

import model.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProductSales {

	// global variables for tests
	final double TAX = 0.07;

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProductSaleWithAvailability() {
		// setup needed variables
		StoreProduct rug = new StoreProduct(003, "Rug", 25.99, 25);
		double total;
		double subtotal;
		double tax;
		
		subtotal = rug.getPrice();
		tax = rug.getPrice() * TAX;
		total = subtotal + tax;
		
		// make expected and actual values
		String expected = "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total;
		
		String actual = ProductSales.sale(rug);
		
		// assert
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testProductSaleWithoutAvailability() {
		// Setup needed variables
		StoreProduct chair = new StoreProduct();
		
		// make expected and actual values
		String expected = "The product is not available for sale because of the lack of stock. Sorry!";
		
		String actual = ProductSales.sale(chair);
		
		// assert 
		assertEquals(expected, actual);
	}
	
	@Test
	public void testProductSaleWithCoupon() {
		// Setup needed variables
		StoreProduct redbull = new StoreProduct(005, "RedBull", 3.99, 129);
		double total;
		double subtotal;
		double tax;
		double couponPercent = 0.2;
		
		subtotal = redbull.getPrice() * (1 - couponPercent);
		tax = redbull.getPrice() * TAX;
		total = subtotal + tax;
		// make expected and actual values
		String expected = "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total;
		
		String actual = ProductSales.saleWithCoupon(redbull, couponPercent);
		
		// assert 
		assertEquals(expected, actual);
	}
}
