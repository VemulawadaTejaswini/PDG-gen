import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String s  = scn.next();

			int a = 2019;
			int cnt = 0;
			for(int i = 0; i < s.length()-3; i++) {
				for(int j = i+3; j < s.length()+1; j++) {
					long kumi = Long.parseLong(s.substring(i, j));
					if(kumi % 2019 == 0) {
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}
}