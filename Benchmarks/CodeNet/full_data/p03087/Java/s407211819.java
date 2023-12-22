import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] L = new int[Q];
		int[] R = new int [Q];
		String[] subs = new String[Q];
		for(int i = 0;i < Q;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			subs[i] = S.substring(L[i]-1,R[i]);
		}
		int[] cnt = new int[Q];
		for(int i = 0;i < Q;i++) {
			for(int j = 0;j < subs[i].length()-1;j++) {
				if(subs[i].charAt(j)=='A'&&subs[i].charAt(j+1)=='C') {
					cnt[i]++;
					j++;
				}
			}
			System.out.println(cnt[i]);
		}
		sc.close();
	}
}