import java.util.Scanner;
public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
       int  Count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                Count++;
            }
        }
            if(Count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not a prime number");
}
}
}
