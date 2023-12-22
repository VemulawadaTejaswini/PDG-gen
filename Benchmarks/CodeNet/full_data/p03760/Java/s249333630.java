import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;


public class Main
{
    String a, b;
    
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
	a = sc.next();
	b = sc.next();
    }

    void out()
    {
	for(int i = 0; i < b.length(); i++) {
	    out(a.charAt(i));
	    out(b.charAt(i));
	}
	if(a.length() != b.length()) out(a.charAt(a.length() - 1));
	System.out.println();
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }

    void out(char ans)
    {
	System.out.print(ans);
    }
    
    void out(String ans)
    {
	System.out.println(ans);
    }
}
