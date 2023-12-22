import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char alphabetfirst = 'a';
		char alphabetlast = 'z';
		boolean flg = true; 
		int num = 0;
		char[] c = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		if(s == "abcdefghijklmnopqrstuvwxyz") flg = false;
		for(int r = 0; r < c.length -1; r++) {
			if (c[r] != alphabetlast) {
				flg = false;
				break;
			}
			alphabetlast--;
		}
		if(flg) {
			System.out.println("-1");
		}else {
			for(int k = 0; k < c.length -1; k++) {
				num++;
				if(c[k] != alphabetfirst) break;
				alphabetfirst++;
				
 			}
			if(num == c.length -1) {
			System.out.println(s.substring(0, num+1) + (char)(s.charAt(num)+1));
			}else {
			System.out.println(s.substring(0, num-2) + (char)(s.charAt(num-2)+1));
			}
		}
	}

}