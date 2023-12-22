import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    long a, b, x;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	out((b / x) - ((a - 1) / x));
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	a = sc.nextLong();
	b = sc.nextLong();
	x = sc.nextLong();
    }

    void out(long n)
    {
	System.out.println(n);
    }
    
    void out(int n)
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
