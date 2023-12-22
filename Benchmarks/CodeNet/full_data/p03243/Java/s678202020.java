import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      int ans =0;
      for (int i=N; i<=999; i++) {
        int i3 = i % 10;
        int i2 = (i % 100 - i3) /10;
        int i1 = (i - i2 * 10 - i3) / 100;
        if (i3 == i2 && i2 == i1) {
          ans = i;
          break;
        }
      }
      System.out.println(ans);
    }
}