import java.util.Scanner;
class Main{
 public static void main(String args[] ){
   
   Scanner in = new Scanner (System.in);
   int letter = in.nextInt();
   String a = in.next();
   int red =0,blue=0;
   for(int i =0;i<a.length();i++)
   {
   		if(a.charAt(i)=='R')red++;
     else if(a.charAt(i)=='B') blue++;
   }
   if(red>blue) System.out.println("Yes");
   else System.out.println("No");
}
}