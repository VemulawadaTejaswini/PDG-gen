import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		
		int[][] sPos = new int[26][s.length * 2];
		for (int i=0; i<sPos.length; i++) {
			Arrays.fill(sPos[i], -1);
		}
		for (int i=0; i<s.length; i++) {
			sPos[s[i] - 'a'][i] = i;
			sPos[s[i] - 'a'][i + s.length] = i;
		}
		
		int now = 0;
		long cnt = 0;
		for (char c : t) {
			boolean contains = false;
			for (int i=now; i<s.length*2; i++) {
				int pos = sPos[c - 'a'][i];
				if (pos != -1) {
					cnt += i - now + 1;
					now = (i + 1)%s.length;
					contains = true;
					break;
				}
			}
			if (!contains) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
	}
}