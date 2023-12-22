import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int count =0;
		int temp =0;
		for (int i=0;i<N;i++) {
			if (s.charAt(i)=='#') {
				temp++;
			} else if (s.charAt(i)=='.') {
				if (temp>0) {
					temp--;
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}