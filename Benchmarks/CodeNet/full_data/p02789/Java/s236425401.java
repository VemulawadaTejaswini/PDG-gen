import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 出力
		if (b == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}