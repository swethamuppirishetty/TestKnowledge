public class IfElseExample {
    public static void main(String[] args) {
        
        int a=40;
        int b=30;
        int c=5;
        // if else-if
        if(a>b && a>c ){
            System.out.println("a is greater");
            System.out.println("Hi");
        }
        else if(b>a && c<b)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
        

        // if-else
        // if(a<b)
        //     System.out.println("a is less than b");
        // else
        //     System.out.println("a is greater than b ");
    }
}
