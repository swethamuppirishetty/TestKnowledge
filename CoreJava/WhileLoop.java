

public class WhileLoop {
    public static void main(String[] args) {
        // int i=1;

        // // while loop
        // while(i>5)
        // {
        //     System.out.println("hello " +i);
        //     i++;
        // }

        // //  do while loop
        // do
        // {
        //     System.out.println("hello " +i);
        //     i++;
        // }while(i>5);

        // even numbers - 2,6,10,14,18 ....100
        int count=1;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                if(count%2==1){
                    System.out.println(i);
                }
                count++;
            }
        }
        
    }
}
