import java.util.*;

public class Main {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int t = sc.nextInt();
   int count = 1;
   int plus = 0;
   int add = 0;
   for (int i = 0; i < n; i++) {
      int next = sc.nextInt();
      if(next >= t * count) {
        if(next == t * count) {
            plus = 0;
        }
        add += plus;
        plus = 0;
        count++;
        continue;
      }
      plus = next - ((count - 1) * t);
   }
   System.out.println((count) * t + add);
 }
}