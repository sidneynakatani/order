package br.com.sidney.order.sell;

public class Product {
	
	protected String name;
	protected double value;

	public Product(String name, double value) {
		this.name  = name;
		this.value = value;
	}
	
	public void executeOrder(){
		System.out.println("Product: " + this.name + " - Value: " + this.value + " is done.");
	}

}
