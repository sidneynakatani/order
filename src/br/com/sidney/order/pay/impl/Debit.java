package br.com.sidney.order.pay.impl;



import br.com.sidney.order.pay.Payment;
import br.com.sidney.order.sell.Product;

public class Debit implements Payment {

	@Override
	public void execute(Product product) {
		System.out.println("Debit payment.");
		product.executeOrder();
	}

}
