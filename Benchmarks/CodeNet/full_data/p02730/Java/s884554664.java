import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Boolean flag1 = false;
		Boolean flag2 = false;
		Boolean flag3 = false;
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();

		// 条件1
		StringBuffer sb = new StringBuffer(S);
		sb.reverse();
		if(S.toString().equals(sb.toString())) {
			flag1 = true;
		}
		
		// 条件2
		String parse = S.substring(0, (N -1)/2);
		sb = new StringBuffer(parse);
		sb.reverse();
		if(parse.toString().equals(sb.toString())) {
			flag2 = true;
		}
		//System.out.println(parse + " " + sb);
	
		// 条件3
		parse = S.substring((N+3)/2-1, N);
		sb = new StringBuffer(parse);
		sb.reverse();
		if(parse.toString().equals(sb.toString())) {
			flag3 = true;
		}
		//System.out.println(parse + " " + sb);
		
		if(flag1 == true && flag2 == true && flag3 == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
