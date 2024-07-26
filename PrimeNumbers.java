public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String args[]){
    int i;
    System.out.println("prime numbers are");
    for(i=1;i<=50;i++){
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(i);
        }
    }
}
}
