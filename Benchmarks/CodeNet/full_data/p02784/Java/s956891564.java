import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int total = 0;
		
		for(int i =0; i < m; i++) {
			int num = sc.nextInt();
			total+=num;
		}

		if(n<=total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		

	}
}
