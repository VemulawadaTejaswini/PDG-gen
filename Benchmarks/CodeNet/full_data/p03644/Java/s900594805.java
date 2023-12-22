import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = 1;
		while(true) {
			if(ans * 2 > N)break;
			ans *= 2;
		}
		System.out.println(ans);
	}
}
