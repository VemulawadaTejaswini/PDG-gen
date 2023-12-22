import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] s1 = scn.nextLine().toCharArray();
		char[] s2 = scn.nextLine().toCharArray();
		int ans = 0;
		for(int i = 0;i < 3;i++) {
			if(s1[i] == s2[i])ans++;
		}
		System.out.println(ans);
	}

}