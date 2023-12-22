import java.util.*;

class Main {
	Scanner sc;
	int N, K;
	String s;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		N = sc.nextInt();
		K = sc.nextInt();
		s = sc.next();
		
		int u = 0;
		int len = s.length();
		for (int i = 1; i < len; i++)
			if (s.charAt(i-1) != s.charAt(i)) u++;
		System.out.println(Math.min(len-1-u+2*K, len-1));
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}