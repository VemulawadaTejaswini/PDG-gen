import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		if(s.length() == 2) {
			if(s.charAt(0) == s.charAt(1)) {
				System.out.println("1 2");
				return;
			} else {
				System.out.println("-1 -1");
				return;
			}
		} else {
			for(int l = 2; l <= 3; l++) {
				int[] c = new int[26];
				for(int j = 0; j < l; j++) {
					c[s.charAt(j) - 97]++;
				}
				for(int m = 0; m < c.length; m++) {
					if(c[m] > 1) {
						System.out.println("1" + l);
						return;
					}
				}
				
				for(int i = l; i < s.length(); i++) {
					c[s.charAt(i) - 97]++;
					c[s.charAt(i-l) - 97]--;
					for(int m = 0; m < c.length; m++) {
						if(c[m] > 1) {
							System.out.println((i-l+2) + " " + (i+1));
							return;
						}
					}
				}	
			}
		}
				
		System.out.println("-1 -1");
		return;
	}
	
}