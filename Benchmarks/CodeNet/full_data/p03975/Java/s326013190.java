import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t;
		int cnt =0 ;
		
		for (int i=0; i<n; i++) {
			t = sc.nextInt();
			if (t<a || t>=b) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		////////////////////////////////////
		sc.close();
	}
}