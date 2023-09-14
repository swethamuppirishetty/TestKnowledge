public class TernaryOper {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        // if(a<b){
        //     System.out.println(a+b);
        // }
        // else{
        //     System.out.println(a-b);
        // }
        int c=a<b ? a+b : a-b;
        System.out.println(c);
    }
}
