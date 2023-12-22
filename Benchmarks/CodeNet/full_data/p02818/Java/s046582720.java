import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		if(a == 0 && b == 0) {
			return;
		}
		for (int i = 0; i < k; i++) {
			if (a > 0) a--;
			else if (b > 0) b--;
		}
		System.out.println(String.format("%d %d", a, b));
	}
}