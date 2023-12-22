import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i = 0;i < N;i++) {
			s[i] = sc.next();
		}
		sc.close();

		int cnt = 0;
		int lastA = 0;
		int firstB = 0;
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < s[i].length()-1;j++) {
				if(s[i].substring(j,j+2).equals("AB")) {
					cnt++;
				}
			}
			if(s[i].endsWith("A")) lastA++;
			if(s[i].startsWith("B")) firstB++;
		}
		cnt += Math.min(lastA, firstB);
		System.out.println(cnt);
	}
}