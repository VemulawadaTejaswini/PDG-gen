import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String s = scan.next();
		String t = scan.next();
		StringBuffer ans = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			ans.append(s.charAt(i)).append(t.charAt(i));
		}
		
		System.out.println(ans.toString());
		scan.close();
	}
}
