import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;


public class Main
{
    int n, m;
    int a[] = new int[51];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	m = sc.nextInt();

	int f, t;
	for(int i = 0; i < m; i++) {
	    f = sc.nextInt(); a[f]++;
	    t = sc.nextInt(); a[t]++;
	}
    }

    void out()
    {
	for(int i = 1; i <= n; i++) out(a[i]);
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
    
    void out(String ans)
    {
	System.out.println(ans);
    }
}
