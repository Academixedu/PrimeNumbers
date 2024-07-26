

public class PrimeNumbers{
    //Scanner obj=new Scanner(System.in);
// complete the Prime Number Logic
public static void main(String[] args) {
    int a =5;
    int count=0;

    // Loop should start from 1 and end at 'a'
    for(int k=1; k<=a/2; k++) {
        if(a%k==0) {
            count++;
        }
    }

    // A prime number has exactly 2 divisors: 1 and itself
    if(count==1) {
        System.out.println(a + " is a prime number");
    } else {
        System.out.println(a + " is not a prime number");
    }
}
}
