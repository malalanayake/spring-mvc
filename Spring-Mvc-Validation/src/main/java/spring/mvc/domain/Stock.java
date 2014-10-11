package spring.mvc.domain;

import java.io.Serializable;

import spring.mvc.validator.StockMaximum;

@StockMaximum(maxStorage="max_storage", quantity="quantity")
public class Stock implements Serializable {
	private int quantity;
	private int max_storage;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMax_storage() {
		return max_storage;
	}

	public void setMax_storage(int max_storage) {
		this.max_storage = max_storage;
	}

}
