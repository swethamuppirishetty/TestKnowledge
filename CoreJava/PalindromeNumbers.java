public class PalindromeNumbers {
    public static void main(String[] args) {
        // 121
        int n=122;  //121, 12
        int i=n;
        int palin=0;

        while(n>0){
            int rem = n%10;
                palin = (palin*10)+ rem;
                n = n/10;
        }

        if(i == palin){
            System.out.println("palin");
        }
        else{
            System.out.println("not palin");
        }
    }
}
