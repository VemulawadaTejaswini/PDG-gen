import java.util.Scanner;

/**
 * https://abc052.contest.atcoder.jp/tasks/abc052_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		
		int ans = 0;
		int x = 0;
		for(char c:s){
			if(c=='I'){
				x++;
				ans = Math.max(ans, x);
			}else{
				x--;
			}
		}
		
		System.out.println(ans);

	}

}