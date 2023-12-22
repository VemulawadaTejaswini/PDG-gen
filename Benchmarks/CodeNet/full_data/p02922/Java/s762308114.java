import java.util.Scanner;

public class Main {
	public static int ceil(int a, int b){
		int x = (a + (b - 1))/b;
		return x;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = ceil(b-1, a-1);
		// 出力
		System.out.println(ans);
	}
}