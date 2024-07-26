import java.util.Scanner;

public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    // int count=0;
    for(int i=1;i<=num;i++){//i=3,i=4
        int count=0; //to reset the value of count
        for(int j=1;j<=i;j++){//1<=3,1<=4
            if(i%j==0){//3%1=0,3%2==1 not,3%3=0  4%1=0
                count++; //+1              +=2    +1=3
            }
        }
      if(count==2){
        System.out.println(i+ " is prime");
      } 
 
    }
    
    
}
}
