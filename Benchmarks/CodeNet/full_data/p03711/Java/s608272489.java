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
		int x= Integer.parseInt(ss0[0]);
		int y = Integer.parseInt(ss0[1]);

		Integer  a[] = {1,3,5,7,8,10,12};
		Integer  b[] = {4,6,9,11};
		Integer  c[] = {2};
		
		
		if((x==2)||(y==2)) { System.out.println("No"); return; }
		
		if ((Arrays.asList(a).contains(x)) && (Arrays.asList(a).contains(y))) { System.out.println("Yes"); return; }
		if ((Arrays.asList(b).contains(x)) && (Arrays.asList(b).contains(y))) { System.out.println("Yes"); return; }
		if ((Arrays.asList(c).contains(x)) && (Arrays.asList(c).contains(y))) { System.out.println("Yes"); return; }


	System.out.println("No");
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



}
