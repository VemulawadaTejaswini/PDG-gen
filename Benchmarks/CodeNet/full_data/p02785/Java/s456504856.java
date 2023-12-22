import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
      
      int h[] = new int[N];
      int th = 0;
      int maxh = 0;
      int ans = 0;
      for(int i=1; i<=N-1; i++){
          int  h =sc.nextInt();
          th = th+h[i];
          maxh = Math.max(maxh,h[i]);
          ans =th - maxh;
      }
      System.out.println(ans);
    }
}