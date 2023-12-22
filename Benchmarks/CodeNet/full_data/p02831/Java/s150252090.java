import java.util.Scanner;
import java.io.*;
public class Main

{
    public static void main(String args[])
    {
        int lcm;
        Scanner sc=new Scanner(System.in);
        String st="";
        int a=sc.nextInt();
        int b=sc.nextInt();

    

   
    lcm = (a > b) ? a : b;

    
    while(true) {
      if( lcm % a == 0 && lcm % b == 0 ) {
        System.out.println(lcm);
        break;
      }
      ++lcm;
    }
  }
}
    