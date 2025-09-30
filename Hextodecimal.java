
package hextodecimal;
import java.util.Scanner;
public class Hextodecimal {
   public static void main(String[] args) {
    Scanner save = new Scanner(System.in);
       System.out.print("Enter a hexa decimal number:");
       String hex=save.nextLine();
       int decimal=Integer.parseInt(hex,16);
       System.out.println("The decimal value is:" +decimal);
   }
}
  
    
