import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		// 整数の入力
		long N = sc.nextInt();
		
		String S = sc.next();
		
		int tmp_a = 0;
		
		String[] a = S.split("");
		char[] b = new char[S.length()];
		
		for(int k = 0; k < N; k++) {
			b[k] = a[k].charAt(0);
		}
		
		for(int n = 1; n < N; n++) {
			if(b[n - 1] == '#' && b[n] == '.') {
				tmp_a++;
			}
 		}
		// 出力
		System.out.println(tmp_a);
	}
}