import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int max = 0;
		int temp = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i, i + 1).equals("A") || S.substring(i, i + 1).equals("C") || S.substring(i, i + 1).equals("G") || S.substring(i, i + 1).equals("T")) {
				temp++;
			} else {
				max = Math.max(max, temp);
				temp = 0;
			}
		}
		System.out.println(Math.max(max, temp));
	}
}
