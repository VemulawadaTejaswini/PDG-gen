import java.util.Scanner;

public class Main {
	static int K;
	static String str;
	static int min;
	static int now = 0;
	static String ans = "";
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 str = scn.nextLine();
		char[] ch = str.toCharArray();
		K = scn.nextInt();
		min = 'z';
		for(int i = 0;i < ch.length;i++) {
			min = Math.min(min, ch[i]);
		}
		solve("");
		System.out.println(ans);
		
	}

	public static String solve(String str2) {
		if(K == now) {
			ans = str2;
			return str2;
		}
		for(int i = min;i <='z';i++) {
			String str3 = str2 + (char)i;
			if(str.indexOf(str3) >= 0) {
				now++;
				solve(str3);
			}
		}
		
		
		return "";
	}
}
