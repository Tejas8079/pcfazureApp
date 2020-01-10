package com.org.procudt.sort;

import java.util.Comparator;

import com.org.product.entity.Product;

public class SortById implements Comparator<Product>{

	@Override
	public int compare(Product pro1, Product pro2) {
		
		return (int) (pro1.getId()-pro2.getId());	
	}

}
