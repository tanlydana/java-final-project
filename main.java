import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] menu = {"Pizza", "Burger", "Fried Chicken", "French Fries"};
        double[] prices = {5.99, 3.99, 4.99, 2.99};
        
        System.out.println("Welcome to Food Ordering System 🍔");
        System.out.println("---------------------------------");
        System.out.println("Menu:");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - $" + prices[i]);
        }
        
        System.out.print("Choose item number: ");
        int choice = input.nextInt();
        
        if (choice < 1 || choice > menu.length) {
            System.out.println("Invalid choice ❌");
        } else {
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            
            double total = prices[choice - 1] * quantity;
            System.out.println("You ordered: " + quantity + " " + menu[choice - 1]);
            System.out.println("Total Price: $" + total);
        }
        
        System.out.println("Thank you for ordering ❤️");
        input.close();
    }
}
