public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    int a = 10;
    int count = 0;
    for(int i=1;i<=a;i++){
        if(a%2==0){
            count++;
        }
    }
    if(count==0){
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
    }
}
}
