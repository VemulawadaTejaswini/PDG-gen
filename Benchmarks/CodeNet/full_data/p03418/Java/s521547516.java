import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans =0;
		for(long b =K+1;b<=N;b++){
		//	System.out.println("b実行" +b);
			for(long Q =0;b*Q <= N ;Q++){
				////System.out.println("Q実行"+Q);
				for(long R =K;R<b;R++){
					long a = b*Q+R;
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
