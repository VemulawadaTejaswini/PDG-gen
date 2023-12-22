import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		sc.close();
		String ans = "";
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("B")) {
				if(!(ans.equals(""))) {
					ans = ans.substring(0,ans.length()-1);
				}
			}else {
				ans += s[i];
			}
		}
		System.out.println(ans);
	}
}