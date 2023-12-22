import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int tmp;
		int index = -1;
		do {
			tmp = scanner.nextInt();
			index++;
		} while (tmp != 1);
		int amari = index % (k-1);
		int ans = index / (k-1);
//		if(amari != 0 && ans == 0) ans++;
		int right = n-amari-index-1;
		ans += right / (k-1);
		if(right % (k-1) !=0) ans++;
		System.out.println(ans);
		
		
	}

}
