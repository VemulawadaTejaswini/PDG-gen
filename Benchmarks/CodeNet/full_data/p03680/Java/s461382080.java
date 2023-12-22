import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    int n;
    int a[] = new int[100001];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	int cnt = 0;
	int now = 1;
	
	while(a[now] != -1) {
	    int tmp = now;
	    now = a[now];
	    a[tmp] = -1;
	    cnt++;
	    if(now == 2) break;
	}
	
	if(now == 2) out(cnt);
	else         out(-1);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
}
