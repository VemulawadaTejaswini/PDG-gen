import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		for(int j=0;j < n;j++) {
			if(a[j] % 2 == 0) {
				if(a[j] % 3 != 0 && a[j] % 5 != 0) {
					System.out.println("DENIED");
					return;
				}
			}
		}

		System.out.println("APPROVED");

		sc.close();

	}

}
