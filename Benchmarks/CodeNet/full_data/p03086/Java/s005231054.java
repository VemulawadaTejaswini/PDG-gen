import java.util.*;
public class Main {

	/*
	 * 122B - 3rd Solution
	 * 
	 * We will loop through the right end point of the possible substring
	 * We will also store (lst) which is the last index where it is not a ACGT character
	 * If the right endpoint is not an AGCT character update lst
	 * We know that [lst+1, i] is a possible substring so update answer
	 * 
	 * Time Complexity O(N), Memory Complexity O(N)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		int ans = 0, lst = -1;
		for(int i = 0; i<N; i++) {
			if(s.charAt(i) != 'A' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && s.charAt(i) != 'T') {
				lst = i;
			}
			ans = Math.max(ans, i-lst);
		}
		System.out.println(ans);
	}
}
