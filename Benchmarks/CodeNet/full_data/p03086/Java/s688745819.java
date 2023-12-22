import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ACGT acgt = new ACGT(s);
		int ans = acgt.calcACGT();
		System.out.println(ans);
	}
	
}

class ACGT {
	String s;
	public ACGT(String s) {
		this.s = s;
	}
	int calcACGT() {
		int length = 0;
		int longest = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isACGT(s.charAt(i))) {
				length++;
			} else {
				longest = Math.max(length, longest);
				length = 0;
			}
		}
		return Math.max(length, longest);
	}
	boolean isACGT(char c) {
		switch (c) {
		case 'A':
		case 'C':
		case 'G':
		case 'T':
			return true;
		}
		return false;
	}
}
