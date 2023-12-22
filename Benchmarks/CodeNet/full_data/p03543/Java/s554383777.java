
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.next();
			String[] strArray = str.split("");
			int[] s = new int[4];
			int flag = 0;
			String ans = "";
			
			for(int i=0;i<4;i++) {
				s[i] = Integer.parseInt(strArray[i]);
			}
			
			for(int i=0;i<2;i++) {
				if(s[i+1] != s[i+2]) break;
				else if(s[i] == s[i+2] && s[i+1] == s[i+2]) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)ans = "No";
			else if(flag == 1) ans = "Yes";
			System.out.print(ans);
		}
	}
}

