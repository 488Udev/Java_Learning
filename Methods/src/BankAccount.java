import java.util.Scanner;
//this is for calling methods understading how to call
class Bank {

    private int balance = 100 ;
    public void deposit(int amount){ //method to deposit
        balance = balance + amount;
        System.out.println("deposited-" + amount);
    }
    public void deposit(int amount1, int amount2){//methos to deposit two amounts
        balance = balance + amount1 + amount2;
        System.out.println("deposited-" + amount1 + amount2);
    }
    public void withdraw(int amount){ //method to withdraw
        if (balance>= amount){
            balance = balance - amount;
            System.out.println("withdrawn-" + amount);
        }else{
            System.out.println("insuff balance");
        }
    }
    public void displayBalance() { //method to display current balance
        System.out.println("current balance- " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args){ //main method
        Bank BankAccount = new Bank(); //calling the class Bank
        Scanner money =  new Scanner(System.in);
        System.out.println("Enter the deposit amount ");
        int depositAmount = money.nextInt();
        if(depositAmount < 1000) {
            BankAccount.deposit(depositAmount);
        } else {
            System.out.println("Since the amount is geater then 1000,Enter the desposit of second amount ");
            int seconddepositAmount = money.nextInt();
            BankAccount.deposit(depositAmount,seconddepositAmount);
        }
        System.out.println("Enter the withdraw amount ");
        int withdrawAmount = money.nextInt();
        //adding money
        BankAccount.withdraw(withdrawAmount);
        BankAccount.displayBalance();




// for two amounts
        System.out.println("Enter the desposit of two amounts ");
        int depositAmount1 = money.nextInt();
        int depositAmount2 = money.nextInt();
        BankAccount.deposit(depositAmount1,depositAmount2);
        money.close();


    }
}