package foodorderproject;

import java.util.Scanner;
public class FoodOrderingApp {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Order order = new Order();

	        while (true) {
	            System.out.println("1. Add Item to Order");
	            System.out.println("2. View Order");
	            System.out.println("3. Complete Order");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter food item name: ");
	                    String itemName = scanner.next();
	                    System.out.print("Enter price: Rs");
	                    double itemPrice = scanner.nextDouble();
	                    FoodItem newItem = new FoodItem(itemName, itemPrice);
	                    order.addItem(newItem);
	                    System.out.println(itemName + " added to your order.");
	                    break;
	                case 2:
	                    order.displayOrder();
	                    break;
	                case 3:
	                    System.out.println("Order completed. Your total is Rs" + order.getTotal());
	                    System.exit(0);
	                case 4:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }

}
