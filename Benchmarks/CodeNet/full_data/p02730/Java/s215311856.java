import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.next();
		int flag = 0;
		

		if (str.length() >= 3 && str.length() % 2 == 1)
			flag = 1;

		if (flag == 1) {
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					flag = 0;
					break;
				}
			}
		

			if (flag == 1) {
				String ans = str.substring(0, (str.length() - 1) / 2);
				for (int i = 0; i < ans.length() / 2; i++) {
					if (ans.charAt(i) != ans.charAt(ans.length() - 1 - i)) {
						flag = 0;
						break;
					}
				}
			}
			
			if (flag == 1) {
				String ans = str.substring(((str.length()+3)/2)-1,str.length());
				for (int i = 0; i < ans.length() / 2; i++) {
					if (ans.charAt(i) != ans.charAt(ans.length() - 1 - i)) {
						flag = 0;
						break;
					}
				}
			}

		}
		if(flag ==1) {
			System.out.println("Yes");
			
		}
		else
			System.out.println("No");


	}
		
}

