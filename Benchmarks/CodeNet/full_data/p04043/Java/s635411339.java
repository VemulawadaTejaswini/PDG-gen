import java.util.*;
 public class Main {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int A = sc.nextInt();
     int B = sc.nextInt();
     int C = sc.nextInt();
     if ((A+B+C)!=17) {
       System.out.println("No");
     } else if(A != 7 && B != 7 && C != 7) {
       System.out.println("No");
     } else if(A != 5 && B != 5 && C != 5) {
       System.out.println("No");
     } else {
       System.out.println("Yes");
     };
   };
 };