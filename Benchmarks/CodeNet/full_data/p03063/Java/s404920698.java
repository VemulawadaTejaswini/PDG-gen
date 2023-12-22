import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		long cnt =  S.chars().filter(ch -> ch == '.').count();
		long wcnt = 0;
		for(int i = 0;i < N;i++) {
			if(S.charAt(i)=='.') {
				wcnt--;
			}else{
				wcnt++;
			}
			cnt = Math.min(cnt, wcnt);
		}
		System.out.println(cnt);
	}
}