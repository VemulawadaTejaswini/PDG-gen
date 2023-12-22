import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n, l;
    String[] strs;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();
	
	Arrays.sort(strs);
	String ans = "";
	for(int i = 0; i < n; i++) ans += strs[i];
	
	out(ans);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	l = sc.nextInt();
	strs = new String[n];
	for(int i = 0; i < n; i++) strs[i] = sc.next();
    }

    void out()
    {
	
    }
    
    void out(int n)
    {
	System.out.println(n);
    }

    void out(double n)
    {
	System.out.println(n);
    }

    void out(long n)
    {
	System.out.println(n);
    }
    
    void out(char c)
    {
	System.out.print(c);
    }
    
    void out(String s)
    {
	System.out.println(s);
    }
}
