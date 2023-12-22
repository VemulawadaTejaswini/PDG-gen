import java.util.Scanner;

/**
 * https://abc053.contest.atcoder.jp/tasks/arc068_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		
		long ans = (x/11)*2;
		long mod = x%11;
		if(mod>0){
			if(mod>6){
				ans+=2;
			}else{
				ans++;
			}
		}
		
		System.out.println(ans);

	}

}
