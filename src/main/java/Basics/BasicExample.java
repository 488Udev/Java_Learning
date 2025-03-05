package Basics;

import java.util.HashMap;

public class BasicExample {
    public void printHelloWorld () {
        System.out.println("Hey world");

    }
    public static void main (String[] args) {
        BasicExample hello = new BasicExample();
        hello.printHelloWorld();


    }

    public static class carexample {
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

    public static class Hashmap {
        public static void main (String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("jake" , 10);
            map.put("caes" , 20);
            map.put("olive" , 30);
            System.out.println("numbers of students" + map.get("jake"));
            System.out.println("All students" + map);

        }
    }

    public static class Choosingloop {
        public static void main (String[] args) {
            System.out.println("choose nay based on your choice");
        }
    }
}
