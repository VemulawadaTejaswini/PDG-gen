import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String S = sc.next();

   
   
   if(N < 3200) System.out.println("red");
   else System.out.println(S);
   
 }
}