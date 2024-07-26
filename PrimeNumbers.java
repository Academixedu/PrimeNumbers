public class PrimeNumbers
{
// complete the Prime Number Logic
public void prime()
{
    int count=0;
    for(int i=1;i<=100;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if(j%i==0)
            {
                count++;
            }
        }
        if (count==2) 
        {
            System.out.println(i);
        }
        count=0;

    }
}
}
