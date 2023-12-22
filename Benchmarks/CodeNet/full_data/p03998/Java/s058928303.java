import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		int a_count = 0;
		int b_count = 0;
		int c_count = 0;
		char tern = 'a';
		while(true) {
			if(tern == 'a') {
				if(checkWin(a, a_count)){
					System.out.println('A');
					break;
				}
				tern = a[a_count];
				a_count++;
			}
			if(tern == 'b') {
				if(checkWin(b, b_count)){
					System.out.println('B');
					break;
				}
				tern = b[b_count];
				b_count++;
			}
			if(tern == 'c') {
				if(checkWin(c, c_count)){
					System.out.println('C');
					break;
				}
				tern = c[c_count];
				c_count++;
			}
		}

	}

	public static boolean checkWin(char[] ary,int count) {
		if(ary.length == count) return true;
		return false;
	}
}