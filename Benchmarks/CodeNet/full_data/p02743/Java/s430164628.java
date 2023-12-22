import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   long d=a*b;
   long c2 = (long)Math.sqrt(c);
   long d2 = (long)Math.sqrt(d);
   if(2*d2<c2){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}
}