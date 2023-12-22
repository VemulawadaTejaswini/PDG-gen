import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// A
		int a = sc.nextInt();
		// B
		int b = sc.nextInt();
		// X
		int x = sc.nextInt();
		
		// 出力
		
		for (int i = 0; i < b; i++) {
			if (a + i == x) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
		
	}
}

