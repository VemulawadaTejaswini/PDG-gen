
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		//x+y/A
		int i = 0;
		while(true) {
			if(A == 2 | B == 42) {
				System.out.println("NO");
				break;
			}
			if(i % A == 0) {
				if(i % B == C) {
					System.out.println("YES");
					break;
				}
			}
			i++;
		}

	}

}
