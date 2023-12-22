import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int h, w;
    String s[] = new String[101];
    
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
	h = sc.nextInt();
	w = sc.nextInt();
	for(int i = 0; i < h; i++) s[i] = sc.next();
    }

    void out()
    {
	for(int i = 0; i < h; i++) {
	    out(s[i]);
	    out(s[i]);
	}
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
