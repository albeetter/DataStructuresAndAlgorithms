package src.javaActivity;
import java.util.Scanner;
public class OptionDSA {
public static void main(String [] args){

        
        System.out.println("Options");
        System.out.println("1 - Sum of digit\n" + "2 - Reverse the number\n" + "3 - Display all the prime numbers from 2 to n \n" + "4 - Palindrome Checking\n" + "5 - Odd or Even number\n" + "6 - Terminate the Program\n");
        Scanner input=new Scanner(System.in);
        
        System.out.print("INPUT INTEGER VALUE:\t");
        int val = input.nextInt();

        System.out.println(); 
        
        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        System.out.println();
        
        int sum = 0;
        

        switch(choice){
            case 1:
                do {
                    sum = sum+val%10;
                    val = val/10;
                }while (val !=0);
                System.out.println("Sum of digit\n" + sum);
                break;
                
            case 2:
                int reverse = reverseInt(val);
                System.out.println("Given: " + val + "\n" + "Reversed: " + reverse);
                break;
                
            case 3:
            	boolean prime[] = new boolean[val + 1];
                for (int i = 0; i <= val; i++)
                    prime[i] = true;
         
                for (int p = 2; p*p <= val; p++) {
                    if (prime[p] == true) {
                        for (int i = p*p; i <= val; i += p)
                            prime[i] = false;
                    }
                }
                for (int i = 2; i <= val; i++) {
                    if (prime[i] == true)
                        System.out.print(i + " ");
                }
                break;
            case 4:
                reverse = reverseInt(val);
                int base = val;
                int rev = reverse;
                
                if (base==rev){
                    System.out.println(val + " is a palindrome");
                }
                else{
                    System.out.println(val + " is not a palindrome");
                }
                break;

            case 5: 

                if (val%2 == 0){
                    System.out.println("Integer is an even number.");
                }
                else{
                    System.out.println("Integer is an odd number.");
                }
                    break;
            	
            default:
            	System.out.println("Julius Albert D. Ortiz");
            	System.exit(0);
                }
                }
            
       
        public static int reverseInt(int val){
            int reversed = 0;
            while(val !=0){
                int number = val%10;
                reversed = reversed*10+number;
                val/=10;
            }
        return reversed;
    }
}
