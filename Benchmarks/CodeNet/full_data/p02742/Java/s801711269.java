import java.util.*;
import java.math.*;

public class Main {
	public static int x, maxn, d;
	public static void main(String ards[])
	{
		Scanner cin = new Scanner(System.in);
		long h = cin.nextLong();
		long w = cin.nextLong();
		long ans = 0, x = 0;
		if(w%2 == 0) x = w/2;
		else x = ((long)w/2)+1;
		
		if(h%2 == 0) ans = (h/2) * w;
		else ans = (((long)h/2)*w)+x;
		
        System.out.println(ans);
	}
}