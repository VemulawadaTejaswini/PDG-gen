import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		char c = ' ';
		char d = ' ';
		int cnt=0;
		
		if(N==1) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i=0;i<N/2;i++) {
			c = S.charAt(i);
			d = S.charAt(N/2+i);
			if(c==d) {
				cnt++;
			}
		}
		if(cnt==N/2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
