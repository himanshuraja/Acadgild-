

import java.util.Scanner;
 
class sum
{
   public static void main(String args[])
   {
      int x,k;
      float y,z;
      System.out.println("Enter two numbers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextFloat();
      z = x + y;
      System.out.println(x + y);
      System.out.println((int) z);
      
   }
}
