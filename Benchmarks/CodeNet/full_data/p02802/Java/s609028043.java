import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String array[][] = new String[n+1][1];
		int ok = 0;
		int ng = 0;
		
		for(int i = 0; i < m; i++) {
			int p = scan.nextInt();
			String s = scan.next();
			if(array[p][0] == null) {
				if(s.equals("AC")) {
					ok++;
					array[p][0] = s;
				} else {
					ng++;
				}
			}
		}

		System.out.println(ok + " " + ng);
	}
}