import java.util.Scanner;

public class printformatandscanner {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = scanner.nextLine();

        System.out.print("age");
        int age = scanner.nextInt();

        System.out.printf("hello , %s , you are %d years old", name , age);


    }
}
