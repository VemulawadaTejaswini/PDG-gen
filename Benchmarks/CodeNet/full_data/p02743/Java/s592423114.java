import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   long a2 = Sqrt1(a);
   long b2 = Sqrt1(b);
   long c2 = Sqrt1(c);

   if(a2+b2<c2){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}

private static long Sqrt1 (long a) {
   return longSqrt(a-1);
}
      static long longSqrt (long a) {
       long x = (long)Math.sqrt(a);
       if(x*x > a) {
           x--;
       }
       return x;
   }
}
