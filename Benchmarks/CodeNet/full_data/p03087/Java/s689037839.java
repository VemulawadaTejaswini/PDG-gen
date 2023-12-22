import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int len = sc.nextInt();
			int numOfQuestion = sc.nextInt();
			String str = sc.next();
			question(str, numOfQuestion, sc);
		}
	}
	
	private static void question(String str, int numOfQuestion, Scanner sc) {
		for(int i=1;i<=numOfQuestion;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			q(str, l, r);
		}
	}
	
	private static void q(String str, int l, int r) {
		System.out.println(countAC(str.substring(l - 1, r)));
	}
	
	private static int countAC(String str) {
		char[] chars = str.toCharArray();
		int len = chars.length;
		int count = 0;
		for(int i=0; i<len - 1; i++) {
			if(chars[i]=='A' || chars[i+1]=='C') {
				count ++;
				i++;
			}
		}
		return count;
	}
}
