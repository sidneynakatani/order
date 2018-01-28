package br.com.sidney.order.pay.impl;



import br.com.sidney.order.pay.Payment;
import br.com.sidney.order.sell.Product;

public class CreditCard implements Payment {

	@Override
	public void execute(Product product) {
		System.out.println("Credit Card payment.");
		product.executeOrder();

	}

}
