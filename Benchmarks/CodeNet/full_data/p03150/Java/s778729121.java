import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		String k = "keyence";

		int j = 0;
		int l = 0;
		boolean flag = true;
		for(int i=0;i<S.length();i++) {
			if(j < k.length() && S.charAt(i) == k.charAt(j)) {
				j++;
				flag = true;
			}else if(flag){
				l++;
				flag = false;
			}

		}

		if(l > 1 || j == 0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}

}
