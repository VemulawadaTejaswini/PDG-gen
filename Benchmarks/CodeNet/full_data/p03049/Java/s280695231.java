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
		int lastA_And_firstB = 0;
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < s[i].length()-1;j++) {
				if(s[i].substring(j,j+2).equals("AB")) {
					cnt++;
				}
			}
		}
		for(int i = 0;i < s[i].length();i++) {
			if(s[i].startsWith("B") && s[i].endsWith("A")) {
				lastA_And_firstB++;
			}else if(s[i].startsWith("B") && !s[i].endsWith("A")) {
				firstB++;
			}else if(!s[i].startsWith("B") && s[i].endsWith("A")) {
				lastA++;
			}
		}
		if(lastA_And_firstB == 0) {
			cnt += Math.min(lastA, firstB);
		}else{
			if(lastA + firstB > 0) {
				cnt += lastA_And_firstB + Math.min(lastA, firstB);
			}else {
				cnt += lastA_And_firstB - 1;
			}
		}
		System.out.println(cnt);
	}
}