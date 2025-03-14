package Methods;
//
class Examplestackandheap {
    public static void main(String[] args) {
        Examplestackandheap obj = new Examplestackandheap();
        int result = obj.add(5, 10);
        System.out.println("Sum: " + result);
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Demo { // Removed 'public' to allow multiple classes in one file
    public static void main(String[] args) {
        int r1 = 5;
        int r2 = 10;
        int sum = r1 + r2;
        System.out.println("Sum in Demo: " + sum);
    }
}

class array {
    public static void main(String[] args) {
        //int n[]= {1,2,3};
        //int m[] = {2,3,4};
        int nums [][] = new int[4][3];
       // int nu[] = new int[4];
        //System.out.println(n[0]);
        //System.out.println(nu[0]);
        for(int i=0;i<4;i++) {
            //System.out.println(nu[i]);
            System.out.println(nums[i]);

        }



    }
}