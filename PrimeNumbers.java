import java.util.Scanner;

public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    int a ;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a value");
    a = scan.nextInt();
    int count = 0;
    if(a == 0 || a== 1)
    {
        System.out.println("It is not a prime number");
    }
    else
    {
        for (int i = 2; i < a ; i++)
        {
            if(a % i ==0)
            {
               count ++;
            }
        }
        if(count == 0)
        {
            System.out.println(a+" It is a Prime number");
        }
        else
        {
         System.out.println(a+" It is Not a Prime Number");
        }
        
    }

}
}

