import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ans = N;
		for(int i=0;i<N;i++) {
			int left = S.substring(0,i).replace("E","").length();
			int right = S.substring(i+1,N).replace("W","").length();
			if(ans>left+right)
				ans = left+right;
		}
		System.out.println(ans);
	}
}