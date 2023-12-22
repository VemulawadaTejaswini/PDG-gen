import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String b = "";
		String w = "";
		
		for(int i = 0; i < N; i++) {
			b+='#';	
			w+='.';
		}
		
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) != b.charAt(i)) {
				cnt1++;
			}
			if(S.charAt(i) != w.charAt(i)) {
				cnt2++;
			}
		}		
		System.out.println(Math.min(cnt1, cnt2));
	}
}