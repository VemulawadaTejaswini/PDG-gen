import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		int x = y / 1000 - n;
		int coefficient1 = 9;	//10000円の係数
		int coefficient2 = 4; //5000円の係数
		int result[] = {-1, -1, -1};
		
		for (int i = 0; i <= n; i++) {
			int tmp = x - (9 * i);
			int tmp2[] = new int[3];
			if (tmp % 4 ==0 && tmp >= 0 && tmp <= 4 * n) {
				tmp2[0] = i;
				tmp2[1] = tmp / 4;
				tmp2[2] = n - tmp2[0] - tmp2[1];
				if (tmp2[2] >= 0 && tmp2[2] <= n) {
					result = tmp2;
					break;
				}
			}
		}
		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
	}
}
