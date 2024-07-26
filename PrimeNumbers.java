import java.util.Scanner;

public class PrimeNumbers{
// complete the Prime Number Logic
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=scan.nextInt();
    int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime Number");
        }
        else{
            System.out.println("Composite Number");
        }
        count=0;
    }
}

