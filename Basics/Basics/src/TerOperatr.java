import java.util.Scanner;

public class TerOperatr {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

                // Take user input
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                String result1 = (age >= 18) ?"adult" : "Not adult";
                System.out.println("You are " + result1);
                scanner.close();
            }
        }



