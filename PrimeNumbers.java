import java.util.Scanner;

public class PrimeNumbers{
// complete the Prime Number Logic
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        int count = 0;
        
        for(int i=1; i<=number; i++){
            if (number%i==0) {
               count++;
                
            }
        }


            if (count==2) {
                System.out.println("This number is a Prime number");
                
            }
            else{
                System.out.println("This number is not a Prime number");
            }
        }
    }
