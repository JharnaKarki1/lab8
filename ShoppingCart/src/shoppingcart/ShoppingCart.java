package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> list = new ArrayList<CartLine>();

	public void action(Product product, String action) {
		if (action.equals("add")){
		for (CartLine cartLine : list) {
			if (cartLine.getProduct().getProductnumber().equals(product.getProductnumber())) {
				cartLine.setQuantity(cartLine.getQuantity()+1);
				return;
			}
		}
		CartLine cartLine = new CartLine();
		cartLine.setProduct(product);
		cartLine.setQuantity(1);
		list.add(cartLine);
		}
		else{
			if (action.equals("remove")){
			Iterator<CartLine> iter = list.iterator();
			while (iter.hasNext()){
				CartLine cartLine = iter.next();
				if (cartLine.getProduct().getProductnumber().equals(product.getProductnumber())){
					if (cartLine.getQuantity()>1){
						cartLine.setQuantity(cartLine.getQuantity()-1);
					}
					else{
						iter.remove();
					}
				}
			}
			}
			else{ //action is print
				System.out.println("Content of the shoppingcart:");
				for (CartLine cartLine : list) {
					System.out.println(cartLine.getQuantity() + " "
							+ cartLine.getProduct().getProductnumber() + " "
							+ cartLine.getProduct().getDescription() + " "
							+ cartLine.getProduct().getPrice());
				}
				System.out.println("Total price ="+getTotal());
			}
		}
	}

	
	// get total price
	public double getTotal(){
		double totalPrice = 0.0;
		for (CartLine c : list) {
			totalPrice=totalPrice+(c.getProduct().getPrice() * c.getQuantity());
		}
		return totalPrice;
	}
}
