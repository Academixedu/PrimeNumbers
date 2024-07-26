public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
     int a=11;
    int count=0;
        
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("this is prime num");
        }else{
            System.out.println("not prime num");
        }
        
    }
}

