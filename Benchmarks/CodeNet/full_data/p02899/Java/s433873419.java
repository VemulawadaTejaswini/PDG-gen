import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] row = new int[n];
		for(int i = 0; i < n; i++) {
			row[sc.nextInt() - 1] = i + 1;
		}
		for(int i = 0; i < n; i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			System.out.print(row[i]);
		}

	}

}