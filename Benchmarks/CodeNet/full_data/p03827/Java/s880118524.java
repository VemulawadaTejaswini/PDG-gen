import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int temp =0;
		int N = sc.nextInt();
		String s = sc.next();
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='D') {
				temp--;
			} else {
				temp++;
				if (temp>max) {
					max= temp;
				}
			}
		}
		System.out.println(max);
	}
}