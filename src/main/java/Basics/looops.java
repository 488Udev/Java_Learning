package Basics;

public class looops
{
    public static void main (String[] args)
    {
        int i = 1;

                while (i < 2) {
                    System.out.println("It's Monday at " + i);
                    int j = 2;

                    while (j < 4) {  // Fixed condition
                        System.out.println("It's Tuesday at " + j);
                        j++; // Fixed infinite loop issue (j should increase)
                    }

                    i++; // Increment to avoid infinite loop
                }
            }
        }

// Class for demonstrating do-while loop
class Loop {
    public static void main(String[] args) {
                int e = 4; // Fixed initial value

                do {
                    System.out.println("It's Tuesday at " + e);
                    e++; // Ensure e increases, so it does not loop infinitely
                } while (e <= 4); // Correct condition
            }
        }

// Class for demonstrating for loop
class FLoop {
            public static void main(String[] args) {
                for (int r = 0; r <= 5; r++) { // Fixed increment direction
                    System.out.println("Hi " + r);
                }
            }
        }
