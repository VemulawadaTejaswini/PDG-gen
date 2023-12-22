import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int res = 0;
		for(int i = 0;i < N;i++) {
			res += 800;
			if((i+1)%15==0) {
				res -= 200;
			}
		}
		System.out.println(res);
	}
}