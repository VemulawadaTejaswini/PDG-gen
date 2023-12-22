import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		sc.close();
		boolean stopFlag = false;
		int count = 1;
		while (!stopFlag) {
			if ((E + 100) * count > F) {
				stopFlag = true;
				break;
			}
			count++;
		}
		count--;
		int countA = 0;
		int countB = 0;
		int water = 0;
		for (int i = 0; i <= 100 * count / A; i++) {
			for (int j = 0; j <= 100 * count / B; j++) {
				if (water < A * i + B * j && A * i + B * j <= count) {
					water = A * i + B * j;
					countA = i;
					countB = j;
				}
			}
		}
		
		int countC = 0;
		int countD = 0;
		int salt = 0;
		for (int i = 0; i <= E * count / C; i++) {
			for (int j = 0; j <= E * count / D; j++) {
				int value = (C * i + D * j) % E;
				int temp = (C * i + D * j) / E;
				if (value > 0) {
					temp++;
				}
				if (salt < C * i + D * j && A * i + B * j <= E * count && temp <= (countA * A + countB * B)) {
					salt = C * i + D * j;
					countC = i;
					countD = j;
				}
			}
		}
		
		int total = water * 100 + salt;
		
		System.out.println(total + " " + salt);
	}
}