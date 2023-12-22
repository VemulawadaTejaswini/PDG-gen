import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   long d=a*b;
   long d2 = (long)Math.sqrt(d);
   if(a+b+2*d2<c){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}
}