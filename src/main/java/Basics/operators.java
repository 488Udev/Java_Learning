package Basics;

public class operators {
    public static void main (String args[]) {
        int x = 10;
        int y = 20;
        //these are the basic Basics.operators
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x<=y);

        //adding strings in this as well
        String txt = "qwertyIsaKeyboard";
        System.out.println("the length is huge" + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //including math
        int maxnNumber = Math.max(x,y);
        System.out.println(maxnNumber);


    }
}
