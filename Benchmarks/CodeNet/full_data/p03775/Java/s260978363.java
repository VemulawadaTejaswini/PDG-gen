import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int sq = (int)(Math.sqrt(n));
		int ans = 0, i;
		for(i = 1; i < sq; i++){
			ans = (int)(Math.log10(n / i)) + 1;
		}
		System.out.println(ans);
	}
}
