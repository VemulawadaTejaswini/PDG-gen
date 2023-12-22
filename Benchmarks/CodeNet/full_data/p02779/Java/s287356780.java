import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int ans=0;
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int k = i+1; k < n; k++) {
				if (a[i] == a[k]) {
					ans=1;
				} 
			}
		}
		if(ans==1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		sc.close();
	}
}
