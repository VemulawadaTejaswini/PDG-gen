import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String s = sc.next();
            String a = s.substring(0, N/2);
            String b = s.substring(N/2, N);
            if(a.equals(b)){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
            }
}
