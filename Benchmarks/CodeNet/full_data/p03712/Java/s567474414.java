import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;


public class Main
{
    int h, w;
    String a[] = new String[101];
    
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

	for(int i = 0; i < h; i++) a[i] = sc.next();
    }

    void out()
    {
	for(int i = -1; i <= h; i++) {
	    if(i == -1 || i == h) {
		String s = "";
		for(int j = 0; j < w + 2; j++) s += "#";
		out(s);
	    } else {
		String s = "#" + a[i] + "#";
		out(s);
	    }
	}
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
