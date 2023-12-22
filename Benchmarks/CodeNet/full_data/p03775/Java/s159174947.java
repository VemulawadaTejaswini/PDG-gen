import java.util.Scanner;

/**
 * https://abc057.contest.atcoder.jp/tasks/abc057_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		
		long a = (int) Math.sqrt(N)+1;
		long b = 0;
		for(; a>=1; a--){
			if(N%a==0){
				b=N/a;
				break;
			}
		}
		
		System.out.println(Math.max(String.valueOf(a).length(), String.valueOf(b).length()));

	}

}