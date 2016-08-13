/*prompting the user to enter 3 ints 
taking their input, finding their sum and average */

   //importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class Practice_2_1 {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner input = new Scanner(System.in);
     
      //prompting the user to enter an integer
      System.out.println("Enter an integer:    ");

      int x = input.nextInt();
      
      //prompting the user to enter an integer
      System.out.println("Enter an integer:    ");
      int y = input.nextInt();
      
      //prompting the user to enter an integer
      System.out.println("Enter an integer:    ");    
      int z = input.nextInt();
      
      //finding the sum of x, y, z
      int sum = x + y + z;
     
      //taking the average of the integers 
      //using a double in case the answer has a decimal place
      double avg = (sum /3.0);
      
      System.out.println("Value of x = " + x );
      System.out.println("Value of y = " + y );
      System.out.println("Value of z = " + z );
      System.out.println("Sum = " + sum);
      System.out.println("Avg = " + avg);            
  }//end of main block          
 }//End of Practice_2_1     