package com.showstarter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void get_all_products_test() {
		Product[] products = Product.get_all_products();
		
		assertEquals(products.length, 123);
		assertEquals(products[103].productID, 701);
		
		assertEquals(products[5].name, "Speaker Stands");
	}

}
