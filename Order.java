package foodorderproject;

import java.util.ArrayList;



public class Order {
	 ArrayList<FoodItem> items = new ArrayList<>();

	    public void addItem(FoodItem item) {
	        items.add(item);
	    }

	    public double getTotal() {
	        double total = 0.0;
	        for (FoodItem item : items) {
	            total += item.price;
	        }
	        return total;
	    }

	    public void displayOrder() {
	        System.out.println("Your Order:");
	        for (FoodItem item : items) {
	            System.out.println(item.name + " - Rs" + item.price);
	        }
	        System.out.println("Total: Rs" + getTotal());
	    }
	}


