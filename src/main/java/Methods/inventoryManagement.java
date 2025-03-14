package Methods;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class inventoryManagement {
    public static void main(String[] args) {
        // Creating Product objects
        Product p1 = new Product(1, "Coffee Mug", 9, 100);
        Product p2 = new Product(2, "Coffee Beans", 10, 1000);
        Product p3 = new Product(3, "Coffee Machine", 12, 1);

        // Storing products in an array
        Product[] products = new Product[3];
        products[0] = p1;
        products[1] = p2;
        products[2] = p3;

        // Display all products
        System.out.println("Inventory Details:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}
