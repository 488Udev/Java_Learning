public class carexample {
    String model; // To hold the car's model
    String color; // To hold the car's color

    // Constructor to initialize model and color
    public carexample(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}
