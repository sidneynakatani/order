package br.com.sidney.order.execute;



import br.com.sidney.order.pay.Payment;
import br.com.sidney.order.sell.Product;

public class SellMachine {
	
	public void sell(Product product, Payment payment){
		payment.execute(product);
	}

}
