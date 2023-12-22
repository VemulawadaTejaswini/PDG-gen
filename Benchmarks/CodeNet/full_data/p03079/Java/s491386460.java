import java.util.*;
public class Main {
 public static void main(String...args) {
   final Scanner sc = new Scanner(System.in);
   final int A = sc.nextInt();
   final int B = sc.nextInt();
   final int C = sc.nextInt();
   System.out.println(A == B && B == C ? "Yes" : "No");
 }
}