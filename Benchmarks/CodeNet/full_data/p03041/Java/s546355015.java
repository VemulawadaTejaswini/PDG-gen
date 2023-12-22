import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		// 文字列の入力
		String S = sc.next();
      	String output = "";
      System.out.println(S.substring(0, K - 1)
                        + S.substring(K - 1, K).toLowerCase()
                        + S.substring(K));
	}
}