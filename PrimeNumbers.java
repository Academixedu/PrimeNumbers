import java.util.Scanner;

public class PrimeNumbers
{
// complete the Prime Number Logic
void meth1()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n=sc.nextInt();

        for (int i=2;i<n;i++)
        {
            if (n%i==0)
            {
                System.out.println("the given is prime number : "+n);
            }

            else 
             {
             System.out.println("The given number is not a pprime ");
            
             }
             break;
        }
        sc.close();

        
    }
public static void main(String[] args) 
{   
      
      new PrimeNumbers().meth1();
}
}
