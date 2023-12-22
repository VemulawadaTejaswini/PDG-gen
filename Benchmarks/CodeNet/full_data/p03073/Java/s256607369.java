import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] tr = line.toCharArray();
		
		if(tr.length == 1) {
			System.out.println(0);
			System.exit(0);
		}
		
		//先頭を変換しないパターン
		int cnt1 = solNoRev(tr);
		//先頭を変換するパターン
		int cnt2 = solRev(tr);

		System.out.println(Math.min(cnt1, cnt2));
		
	}
	
	static private char rev(char c) {
		if(c == '1') {
			return '0';
		} else {
			return '1';
		}
	}
	
	static private int solNoRev(char[] tr) {
		char ptr = tr[0];
		int cnt = 0;
		for(int i=1; i<tr.length; i++) {
			if(ptr == tr[i]) {
				ptr = rev(tr[i]);
				cnt ++;
			} else {
				ptr = tr[i];
			}
		}
		return cnt;
	}

	static private int solRev(char[] tr) {
		char ptr = rev(tr[0]);
		int cnt = 1;
		for(int i=1; i<tr.length; i++) {
			if(ptr == tr[i]) {
				ptr = rev(tr[i]);
				cnt ++;
			} else {
				ptr = tr[i];
			}
		}
		return cnt;
	}
