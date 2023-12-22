import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean bool = true;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(a[i] == a[j] && i != j) {
					bool = false;
					break;
				}
			}
		}
		if(bool) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
}
