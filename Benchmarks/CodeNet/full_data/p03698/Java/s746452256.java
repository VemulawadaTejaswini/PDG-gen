import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Arrays.sort(s);
		boolean diff = true;
		for(int i = 0; i < s.length - 1; i++) {
			if(s[i] == s[i + 1]) {
				diff = false;
				break;
			}
		}
		if(diff) System.out.println("yes");
		else System.out.println("no");
	}
}