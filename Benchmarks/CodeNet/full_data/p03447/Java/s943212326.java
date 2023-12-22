import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int numB = (X-A)%B;
		int out = X - A - numB * B;
		// 出力
		System.out.println(out);
	}
}