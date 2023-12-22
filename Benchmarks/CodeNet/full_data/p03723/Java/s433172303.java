import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		long a = Long.parseLong(ss0[0]);
		long b = Long.parseLong(ss0[1]);
		long c = Long.parseLong(ss0[2]);
		
		//奇数がある
		if (isEnd(a, b, c)) { System.out.println(0); return; }
//		if ( a%2 == 1 ) { System.out.println(0); return; }
//		if ( b%2 == 1 ) { System.out.println(0); return; }
//		if ( c%2 == 1 ) { System.out.println(0); return; }

		//全部同じ
		if ((a==b)&&(b==c)) { System.out.println(-1); return; }

		long x;
		long y;
		long z;
		long count = 0L;
		
		do {
			x = (b+c)/2;
			y = (c+a)/2;
			z = (a+b)/2;
			count += 1;
			a=x;
			b=y;
			c=z;
		} while (isEnd(x,y,z)==false);

//		if (isEnd(x,y,z)) { System.out.println(count); return; }

        System.out.println(count);
        return;
    }
    //-----------------------------------------------------------------
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

	static boolean isEnd(long a, long b, long c) {
		if ( a%2 == 1 ) { return true; }
		if ( b%2 == 1 ) { return true; }
		if ( c%2 == 1 ) { return true; }
		return false;
	}


}
