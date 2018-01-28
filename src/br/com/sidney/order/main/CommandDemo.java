package br.com.sidney.order.main;



import br.com.sidney.order.execute.SellMachine;
import br.com.sidney.order.pay.impl.CreditCard;
import br.com.sidney.order.pay.impl.Debit;
import br.com.sidney.order.sell.Product;

public class CommandDemo {
	
	public static void main(String[] args){
		
		SellMachine seller = new SellMachine();
		
		Product livro = new Product("Java Efetivo", 100.00);
		Product blusa = new Product("Blusa preta" , 150.00);
		
		
		seller.sell(livro, new Debit());
		seller.sell(blusa, new CreditCard());
		
	}

}
