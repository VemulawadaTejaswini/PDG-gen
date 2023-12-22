import java.util.Scanner;

public class Main {
	static int[] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		int count = 0;
		while(isGusu(num)) {
			count++;
			for(int j = 0; j < num.length; j++) {
				num[j] = num[j] / 2;
			}
		}
		System.out.println(count);
	}
	static boolean isGusu(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 1) {
				return false;
			}
		}
		return true;
	}
}