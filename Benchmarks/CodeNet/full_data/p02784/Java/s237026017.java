import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		solve();
	}
	static void solve() {
		Scanner sc = new Scanner(System.in); 
		int h = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int array[] = new int [n];
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
			sum+=array[i];
			}
		if(sum>=h) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
