import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();

		int ans = Integer.parseInt(n.substring(0, 1)) - 1;

		boolean flg = true;
		for (int i = 1; i < n.length(); i++) {
			if(!n.substring(i,i+1).equals("9")){
				flg = false;
			}
			ans = ans + 9;
		}
		if(flg) {
			ans = ans+1;
		}
		System.out.println(ans);
	}
}