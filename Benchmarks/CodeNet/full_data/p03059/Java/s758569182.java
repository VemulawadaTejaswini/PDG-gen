
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());//int型
		int B = Integer.parseInt(sc.next());//int型
		int T = Integer.parseInt(sc.next());//int型
		sc.close();
		int ans = T/A * B;
		
		System.out.println(ans);
	}

}
