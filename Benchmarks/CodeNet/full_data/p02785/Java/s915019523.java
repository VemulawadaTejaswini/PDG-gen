import java.util.*;
public class Program{
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
      	n = scan.nextInt();
      	t = scan.nextInt();
		int [] ar = new int[n + 1];
      	for (int i = 1 ; i <= n ; i++)
        	ar[i] = scan.nextInt();
      	Arrays.sort(ar);
      	int ans = 0;
      	for (int i = 1 ; i <= max(0,n-t) ; i++)
        	ans += ar[i];
      	System.out.println(ans);
    }
}