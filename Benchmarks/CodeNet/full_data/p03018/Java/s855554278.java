import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int count = 1;
		long sum = 0;
		
		while(count > 0) {
			count = 0;
			for(int i = 0; i < s.length() - 2; i++) {
				if(s.substring(i, i + 3).equals("ABC")) {
					s.replace(i, i + 3, "BCA");
					count++;
					sum++;
				}
	//			System.out.println(s);
			}
		//	System.out.println(s);
		}
		System.out.println(sum);
	}
}
