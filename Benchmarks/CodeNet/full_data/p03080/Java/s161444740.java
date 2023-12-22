import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		int ans = 0;
		for(int i = 0;i < N;i++) {
			if(str[i]=='R') {
				ans++;
			}
		}
		System.out.println(2*ans > N?"Yes":"No");
	}

}
