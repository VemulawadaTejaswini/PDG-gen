import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int s[] = new int[4];
		int ans = 0;

		s[0] = Integer.parseInt(S.substring(0,1));
		s[1] = Integer.parseInt(S.substring(1,2));
		s[2] = Integer.parseInt(S.substring(2,3));
		s[3] = Integer.parseInt(S.substring(3,4));
		
		for(int i = 0;i < 4;i++) {
			if(s[i] == 2) {
				ans++;
			}
			
		}
		
		
		
		System.out.println(ans);

	}

}