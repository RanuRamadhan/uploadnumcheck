/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercheck;

/**
 *
 * @author Ranu Ramadhan
 */
import java.util.Scanner;
public class CheckPrime
{

 public static void CheckPrime()
 {
 int x, count=0;
 System.out.println("Enter an integer to check if it is prime or not ");
 Scanner in = new Scanner(System.in);
 x = in.nextInt();

 for(int i=2; i< x; i++)
 {
 if ( x % i == 0 )
 count=count+1;
 }
 if (count ==0)
 System.out.println("The number is prime");
 else
 System.out.println("The number is not prime");

 }
}
