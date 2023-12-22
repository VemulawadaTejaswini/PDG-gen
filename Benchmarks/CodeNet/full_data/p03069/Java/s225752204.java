import java.util.Scanner;
public class p3_ {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		// 整数の入力
		int N = sc.nextInt();
		
		String S = sc.next();
		
		int tmp_a = 0;
		int n_s = 0;
		int n_d = N - n_s;
		
		String[] a = S.split("");
		char[] b = new char[S.length()];
		
		for(int k = 0; k < N; k++) {
			b[k] = a[k].charAt(0);
			if(b[k] == '#') {
				n_s++;
			}
		}
		
		if(n_s > n_d) {
			tmp_a = n_d;
		}
		else {
			tmp_a = n_s;
		}
		// 出力
		System.out.println(tmp_a);
	}
}