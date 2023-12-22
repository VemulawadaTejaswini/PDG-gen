import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n;
    String s;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	int mx = 0;
	int x = 0;
	for(int i = 0; i < s.length(); i++) {
	    if(s.charAt(i) == 'I') x++;
	    else x--;

	    mx = Math.max(mx, x);
	}
	
	out(mx);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	s = sc.next();
    }

    void out()
    {
	
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
