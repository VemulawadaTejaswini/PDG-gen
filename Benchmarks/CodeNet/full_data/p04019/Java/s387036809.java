import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int v = 0;
		int h = 0;
		for(int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if(c == 'N') {
				v++;
			}else if(c == 'S') {
				v--;
			}else if(c == 'E') {
				h++;
			}else {
				h--;
			}
		}
		if(v == 0 && h == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
