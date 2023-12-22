import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();

		int start = 0;
		while (true){
			int idx = s.indexOf(t.substring(0, 1), start);
			if(idx==-1) break;
			start=idx+1;
			if(t.endsWith(s.substring(0, idx)) && t.startsWith(s.substring(idx))) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");

	}
}