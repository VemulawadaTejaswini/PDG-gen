import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long a = (long)(Math.pow(10, 9) + 7);
		for(int i = 0; i <= n; i++){
			ans = i * ans % a;
		}
		System.out.println(ans);
	}
}
