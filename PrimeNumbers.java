import java.util.Scanner;
public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    int n,i;
    int pn=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            pn=pn+1;
        }
    }
        if(pn==2)
        {
            System.out.println("It is prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
        
    }
}