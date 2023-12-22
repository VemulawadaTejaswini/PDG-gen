import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int max = Math.max(N, M);
		int min = Math.min(N, M);
		String s = "";
		for (int i = 0; i < max; i++) {
			s = s + min;
		}
		System.out.println(s);
	}

}