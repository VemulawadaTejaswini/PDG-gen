import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sa = scanner.next();
		String sb = scanner.next();
		String sc = scanner.next();
		scanner.close();
		
		int aidx = 0, bidx = 0, cidx = 0;
		char next = 'a';
		char ans = 0;
		while(ans == 0) {
			switch(next) {
			case 'a':
				if(aidx == sa.length()) {
					ans = 'A';
					break;
				}
				next = sa.charAt(aidx);
				aidx++;
				break;
			case 'b':
				if(bidx == sb.length()) {
					ans = 'B';
					break;
				}
				next = sb.charAt(bidx);
				bidx++;
				break;
			case 'c':
				if(cidx == sc.length()) {
					ans = 'C';
					break;
				}
				next = sc.charAt(cidx);
				cidx++;
				break;
			}
		}
		System.out.println(ans);
	}
}
