import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = x.substring(0,4);
		String z = x.substring(4);
		
		int k = 2018;
		y = String.valueOf(k);
		
		String ans = y + z;
		System.out.println(ans);
	}

}
