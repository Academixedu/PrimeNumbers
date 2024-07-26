public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    int a =100;
    int count = 0;
    for (int j=1; j<=100; j++){
          for (int i=1; i<=j; i++){
                if (j%i ==0){
                  count++;
         }
      }
         if (count==2){
          System.out.println(j);
      }
     count=0;
    
   }
   }  
}  