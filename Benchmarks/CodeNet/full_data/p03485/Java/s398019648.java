

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
   int a =sc.nextInt();
   int b =sc.nextInt();
   double x =(a+b)/2.0;
   int p =(a+b)/2;
   if (x-p==0.5) {
	   System.out.println(p+1);


   }
   else {System.out.println(p);}

	}

}
