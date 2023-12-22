import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans =0;
		for(int b =K+1;b<=N;b++){
		//	System.out.println("b実行" +b);
			for(int Q =0;b*Q <= N ;Q++){
				////System.out.println("Q実行"+Q);
				if(b*Q==0){
					ans = ans + b-K;
				}
				for(int R =K;R<b;R++){
					int a = b*Q+R;
					if(a<=N&&a>0){
						ans++;
					//	System.out.println("R実行"+R);
						//System.out.println(b*Q+R+""+b+""+Q+""+R);
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
