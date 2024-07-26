public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) 
{
    int a=17;
    int count = 0;
    for(int i=2;i<a/2;i++)
    {
        if(a%2==0)
        {
            count++;
        }
    }
    System.out.println("enter the number is 17");
    if(count==0)
    {
        System.out.println("prime no");
    
    }
    else{
        System.out.println("not a prime");
    }
}
}


