import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int q = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(s);
		
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				sb = sb.reverse();
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					sb.insert(0, c);
				} else {
					sb.append(c);
				}
				
			}
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}

}
