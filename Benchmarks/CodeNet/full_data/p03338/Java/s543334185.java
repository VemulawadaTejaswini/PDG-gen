import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int[] alp = new int[26];
			int[] alp2 = new int[26];
			String front = S.substring(0,i+1);
			String back = S.substring(i+1,N);
			for (int j = 0; j < front.length(); j++) {
				alp[front.charAt(j) - 'a']++;
			}
			for (int j = 0; j < back.length(); j++) {
				alp2[back.charAt(j) - 'a']++;
			}
			int count = 0;
			for (int j = 0; j < alp.length; j++) {
				if (0 < alp[j] && 0 < alp2[j]) {
					count++;
				}
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}