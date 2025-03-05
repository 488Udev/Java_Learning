package Basics;

import java.util.Scanner;

public class Swtchexample {
    public static void main (String[] args){
        //int n = 30;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a month:");
        String month = scanner.nextLine();
        String days = switch(month) {

            case "jan", "march", "apr", "may","jun","jul","aug","sep","oct","nov","dec" -> "30 days";
            case "feb" -> "29 days";
            default -> "invalid";
        };
        System.out.println(days);
        scanner.close();
    }
}

class Studgrade {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student grade (0-100):");
        int grade = scan.nextInt();
        String score = switch(grade/10) {

            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> (grade >= 0 && grade < 60) ? "F" : "invalid";
        };
        System.out.println(score);
        scan.close();


        }

    }
