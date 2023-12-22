import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    String w;
    Map<String, Integer> map = new HashMap<>();
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	for(int i = 0; i < w.length(); i++) {
	    String c = String.valueOf(w.charAt(i));
	    if(map.get(c) == null) {
		map.put(c, 1);
	    } else {
		map.put(c, map.get(c) + 1);
	    }
	}

	boolean flg = true;
	for(String key : map.keySet()) {
	    if(map.get(key) % 2 == 1) flg = false;
	}
	
	if(flg) out("Yes");
	else    out("No");
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	w = sc.next();
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
