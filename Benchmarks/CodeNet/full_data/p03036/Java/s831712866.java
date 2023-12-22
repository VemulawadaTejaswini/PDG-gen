import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int ans[] = new int[10];
		ans[0] = r*x-d;

		for(int i= 1; i<10; i++) {
			ans[i] = r*ans[i-1]-d;
		}

		for(int j=0; j<ans.length; j++) {
			System.out.println(ans[j]);
		}
	}

}
