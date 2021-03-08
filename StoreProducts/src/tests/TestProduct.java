package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StoreProduct;

public class TestProduct {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testProductAvailableTrue() {
		// make product
		StoreProduct orange = new StoreProduct(001, "Orange", 1.99, 100);
		
		// assert
		assertTrue(orange.productAvailability());
	}

	@Test 
	public void testProductAvailableFalse() {
		// make product 
		StoreProduct iphone = new StoreProduct();
		
		// assert 
		assertFalse(iphone.productAvailability());
	}
	
	@Test 
	public void testProductToString() {
		// make product 
		StoreProduct apple = new StoreProduct(002, "Apple", 0.99, 200);
		
		// make expected and actual values
		String expected = "StoreProduct [productId=" + apple.getProductId() + ", name=" + apple.getName() + ", price=" + apple.getPrice() + ", stock=" + apple.getStock()
				+ "]";
		String actual = apple.toString();
		
		// assert 
		assertEquals(expected, actual);
	}
}
