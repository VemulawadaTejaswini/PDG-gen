import java.util.Scanner;
public class Main{
 public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);
   int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
   if (a<=c && a+b>=c) System.out.print("Yes");
   else System.out.print("No");
 }
}
