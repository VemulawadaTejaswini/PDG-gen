import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,cnt=0,cnt2=0;
		String S;
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		S=sc.next();

		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='.') {
				cnt++;
			}
		}
		cnt2=N-cnt;
		if(cnt>cnt2) {
			System.out.println(cnt2);
		}
		else if(cnt<cnt2) {
			System.out.println(cnt);
		}
		sc.close();
	}

}