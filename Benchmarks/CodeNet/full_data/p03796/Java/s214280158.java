import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long ans = 1;
		long num = (long)(1E9 + 7);
		System.out.println(num);
		for(int i = 1;i <= N;++i) {
			ans = ans * i;
			if(ans > num)
				ans = ans % num;
		}
		System.out.println(ans);
	}
}
