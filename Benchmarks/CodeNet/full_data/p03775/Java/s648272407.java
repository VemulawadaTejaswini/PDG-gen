import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = (n+"").length();
		long i;
		for(i = 1; i < n; i++){
			if(n % i == 0 && ((n / i)+"").length() < ans){
				ans = ((n/i)+"").length();
			}
		}
		System.out.println(ans);

	}
}
