import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = 1;i <= N;++i) {
			int num = i;
			int x = 0;
			for(int j = (int)Math.log10(N);j >= 0;--j) {
				x += num / (int)Math.pow(10, j);
				num = i % (int)Math.pow(10, j);
			}
			if(A <= x && x <= B)
				ans += i;
		}
		System.out.println(ans);
	}
}
