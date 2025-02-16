class example {
    int a;
    public int add()
    {
        return 0;

    }
}
public class MethParameters {

    //MethParameters is class

    public static void main(String[] args){
        //main is method
        int n1 = 0;
        int n2 = 1;
        int result = n1 + n2;
        System.out.println(result);
        System.out.println(MethParameters.class.getSimpleName());
        example Ex = new example();
        //example is class
        //Ex is variable
        //new example is object
    }

}
