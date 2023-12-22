import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int count = 1;
		long sum = 0;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.substring(i, i + 2).equals("BC")) {
				s.replace(i, i + 2, "D");
			}
		}
		
		while(count > 0) {
			count = 0;
			for(int i = 0; i < s.length() - 1; i++) {
				if(s.substring(i, i + 2).equals("AD")) {
					s.replace(i, i + 2, "DA");
					count++;
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
