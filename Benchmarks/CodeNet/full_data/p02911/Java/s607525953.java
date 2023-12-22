import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] ans = new int[n];
		
		int kizyun = k-q;
		
		for(int i = 0; i < q; i++) {
			int num = sc.nextInt();
			ans[num-1]++;
		}
		
		for(int answer : ans) {
			if(answer+kizyun > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		

	}
}
