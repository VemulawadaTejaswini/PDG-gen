import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
 		int x = 0, max = 0;
		for(int i = 0; i < N; i++) {
			if(S[i] == 'I') {
				x++;
			}
			if(S[i] == 'D') {
				x--;
			}
			max = Math.max(max, x);
		}
		System.out.println(max);
	}

}
