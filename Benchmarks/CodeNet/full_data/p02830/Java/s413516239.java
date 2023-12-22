import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String X = sc.next();
   String Y = sc.next();
   
   String ans = "";

   for(int i = 0;i<n;i++)
   {
     ans+=X.substring(i,i+1)+Y.substring(i,i+1);
   }
   
     System.out.println(ans);
   
 }
}