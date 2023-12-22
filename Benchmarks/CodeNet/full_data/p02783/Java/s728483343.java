import java.util.*;
public class Main{
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int t = scan.nextInt();
		int [] ar = new int[n + 1];
      	for (int i = 1 ; i <= n ; i++)
        	ar[i] = scan.nextInt();
      	Arrays.sort(ar);
      	long ans = 0;
      	for (int i = 1 ; i <= Math.max(0,n-t) ; i++)
        	ans += ar[i];
      	System.out.println(ans);
    }
}