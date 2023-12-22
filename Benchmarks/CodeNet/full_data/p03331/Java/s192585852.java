import java.util.Scanner;
public class Main {
	int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}
	
	void test(Scanner sc){
		T = sc.nextInt();
		long out = Long.MAX_VALUE;
		for (int i = 1; i <= T/2; i++) {
			int b=T-i;
			String s = ""+b;
			s = i+s;
			long sum=0;
			for (int j = 0; j < s.length(); j++) {
				sum+=s.charAt(j)-'0';
			}
			out=out>sum?sum:out;
		}
		System.out.println(out);
	}
}
