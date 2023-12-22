import java.util.Scanner;

/**
 * https://abc044.contest.atcoder.jp/tasks/abc044_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		int[] count = new int[26];
		for(char c:w.toCharArray()){
			count[c-'a']++;
		}
		
		String ans = "Yes";
		for(int c:count){
			if(c%2==1){
				ans = "No";
				break;
			}
		}
		
		System.out.println(ans);

	}

}
