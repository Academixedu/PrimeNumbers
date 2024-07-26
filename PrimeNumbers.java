public class PrimeNumbers{
// complete the Prime Number Logic
    public static void main(String args[]){
        //1-100//
        
        for(int j=1;j<=100;j++){
            int count=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                   count++;
                }
            }
            if(count==2){
                System.out.println(j+" is a prime number");
            }
        }
    }
}
