import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc060.contest.atcoder.jp/tasks/abc060_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		Set<Integer> set = new HashSet<Integer>();		
		String ans = "NO";
		int i=0;
		
		while(true){
			int m = (i*A)%B;
			if(m==C){
				ans = "YES";
				break;
			}else if(set.contains(m)){
				break;				
			}
			set.add(m);
			i++;
		}
		System.out.println(ans);

	}

}