/**
 * @author ClaytonBlake - csblake
 * CIS175 - Spring 2021
 * 03/06/2021
 */
package model;

public class ProductSales {
	final static double TAX = 0.07;

	// methods for the StoreProduct class
	public static String sale(StoreProduct product) {
		double total;
		double subtotal;
		double tax;
		
		if(product.productAvailability()) {
			// calculate the total
			subtotal = product.getPrice();
			tax = product.getPrice() * TAX;
			total = subtotal + tax;
			
			// return the subtotal, tax, and total cost to the user
			return "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total;
		} else {
			return "The product is not available for sale because of the lack of stock. Sorry!";
		}
	}
	
	public static String saleWithCoupon(StoreProduct product, double couponPercent) {
		double total;
		double subtotal;
		double tax;
		
		// calculate the total
		if(product.productAvailability()) {
			// calculate the total
			subtotal = product.getPrice() * (1 - couponPercent);
			tax = product.getPrice() * TAX;
			total = subtotal + tax;
			
			// return the subtotal, tax, and total cost to the user
			return "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total;
		} else {
			return "The product is not available for sale because of the lack of stock. Sorry!";
		}		
	}
}
