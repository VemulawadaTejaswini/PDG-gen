import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int i = 0;
		while(i < N) {
			a[i] = sc.nextInt();
			i++;
		}

		Arrays.sort(a);
		boolean result = true;
		for(i = 1;i < N;i++) {
			if(a[i] == a[i-1]) {
				result = false;
				break;
			}
		}

		if(result == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}