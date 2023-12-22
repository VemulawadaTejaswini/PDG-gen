import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'C' || str.charAt(i) == 'G' || str.charAt(i) == 'T') {
				count++;
				
				if (max < count) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(max);
	}
}
