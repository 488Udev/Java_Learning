package Methods;

class Calculator {
    public String addNumbers (int n, int y ) {

        int Sum = n + y;
        System.out.println(Sum);
        if (Sum >= 100){
            return "Sum";
    }else {
            return "total is less than 100";
        }


    }

}
public class Justademo {
 public static void main (String[] args) {

     Calculator Cal = new Calculator();
     Cal.addNumbers(7,8);
     System.out.println("The total is less then 100");

    }


}
