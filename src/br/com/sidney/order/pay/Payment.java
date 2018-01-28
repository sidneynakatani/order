package br.com.sidney.order.pay;

import br.com.sidney.order.sell.Product;

public interface Payment {
	
	public void execute(Product product);

}
