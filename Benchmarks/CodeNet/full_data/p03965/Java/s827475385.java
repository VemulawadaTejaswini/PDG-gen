import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int g = 0, p = 0, count = 0;
		for (int i = 0; i < s.length; i++) {
			if(s[i] == 'g') {
				if(g > p) {
					p++;
					count++;
				}else {
					g++;
				}
			}else {
				if(g > p) {
					p++;
				}else {
					g++;
					count--;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}