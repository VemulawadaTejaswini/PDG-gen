import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int maxCnt = 0;
		int maxNum = 1;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			int num = i;
			while (num % 2 == 0) {
				cnt++;
				num /= 2;
			}
			
			if (cnt > maxCnt) {
				maxCnt = cnt;
				maxNum = i;
			}
		}
		
		System.out.println(maxNum);
		
		sc.close();
	}
}


