import java.util.Scanner;

public class Main {
	/*
	a を b 回繰り返した文字列は a で始まり、b を a 回繰り返した文字列は b で始まるため、
	a < b ならば常に a を b 回繰り返した文字列の方が辞書順で小さいですし、
	a > b ならば常に b を a回繰り返した文字列の方が辞書順で小さいです。
	また、a = b なら二つの文字列が等しくなるのでどちらを出力しても同じになります
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		StringBuffer ans = new StringBuffer();
		if(A < B) {
			for(int i = 0; i < B; i++) {
					ans.append(A);
			}
		}else {
			for(int i = 0; i < A; i++) {
					ans.append(B);
			}
		}
		System.out.println(ans.toString());
	}
}