import java.util.Scanner;

public class PrimeNumbers{
// complete the Prime Number Logic
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        if(a<=1){
            System.out.println("not a prime num");
        }
        
        int count = 0;
        for (int j = 1; j <= a; j++) { 
             if (a % j == 0) {
                count++;
            }
        }
       if (count == 2) {
           System.out.println("prime num");
       } else {
           System.out.println("not a prime num");
       }
   }  
}

