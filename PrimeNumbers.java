public class PrimeNumbers{
// complete the Prime Number Logic
public static void main (String args[]){
    int a=100;
    int count=0;
    for (int i=1;i<=100;i++){
        if(a%i==0){
            count++;

        }
    }
        if (count==2){
            System.out.println("prime number");
        }else{
            System.out.println("Not a prime");
        }
    }
}
