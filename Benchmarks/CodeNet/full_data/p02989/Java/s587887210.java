import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int N = sc.nextInt();
		int a[]=new int[N];
		
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println(a[N / 2]  - a[N / 2 - 1]);

	}
}