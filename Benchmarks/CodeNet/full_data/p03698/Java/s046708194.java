import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    String str;
    Map<String, Integer> map = new HashMap<>();
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	boolean flg = true;
	for(int i = 0, l = str.length(); i < l; i++) {
	    String c = str.substring(i, i + 1);
	    if(map.get(c) != null) flg = false;
	    map.put(c, 1);
	}
	
	if(flg) out("yes");
	else    out("no");
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	str = sc.next();
    }

    void out()
    {
	
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
