import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String keyence = "keyence";
		String[][] keyarr = new String[7][2];
		for(int i = 0;i < 8;i ++) {
			keyarr[i][0] = keyence.substring(0, i);
			keyarr[i][1] = keyence.substring(i, 8);
			if(s.indexOf(keyarr[i][0]) == 0 && 
					s.indexOf(keyarr[i][1]) == s.length() - keyarr[i][1].length()) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}