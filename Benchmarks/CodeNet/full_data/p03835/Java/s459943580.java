import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;
		for (int i = 0; i < k; i++) {
			for (int t = 0; t < k; k++) {
				int temp = 0;
				temp = i + t;
				if(s - temp <= k)count++;
			}
		}
		System.out.println(count);
	}
}