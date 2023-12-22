import java.util.Scanner;

/**
 * https://arc091.contest.atcoder.jp/tasks/arc091_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		long ans = 0;
		if(N==2 || M==2){
			ans = 0;
		}else if(N==1){
			ans = Math.max(0, M-2);
		}else if(M==1){
			ans = Math.max(0, N-2);
		}else{
			ans = (M-2)*(N-2);
		}
		
		System.out.println(ans);

	}

}