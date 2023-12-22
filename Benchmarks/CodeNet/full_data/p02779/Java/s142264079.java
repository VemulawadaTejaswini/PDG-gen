import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Integer> st = new TreeSet<>();
		for(int i = 0; i < n; i++) st.add(in.nextInt());
		if(st.size() == n) System.out.println("YES");
		else System.out.println("NO");
	}
} 
