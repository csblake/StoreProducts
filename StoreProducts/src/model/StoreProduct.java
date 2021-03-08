/**
 * @author ClaytonBlake - csblake
 * CIS175 - Spring 2021
 * 03/06/2021
 */
package model;

public class StoreProduct {

	// instance variables
	private int productId;
	private String name;
	private double price;
	private int stock;
	
	// constructors
	public StoreProduct() {
		// default
	}
	
	public StoreProduct(int productId, String name, double price, int stock) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// getters and setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// methods
	@Override
	public String toString() {
		return "StoreProduct [productId=" + productId + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	public boolean productAvailability() {
		if (stock > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
