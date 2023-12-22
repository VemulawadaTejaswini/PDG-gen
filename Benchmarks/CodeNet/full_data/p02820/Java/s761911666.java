import java.util.Scanner;

public class Main {
	static int r;
	static int s;
	static int p;
	static int n;
	static int k;
	static int max = 0;
	static String t;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		r = sc.nextInt();
		s = sc.nextInt();
		p = sc.nextInt();
		t = sc.next();
		char[] hand = new char[k];
		max = check(0, 0, hand);
		System.out.println(max);
	}
	
	public static int check(int index, int count, char[] hand) {
		if (index >= t.length()) {
			return count;
		} else {
			char[] hand1 = hand.clone();
			char[] hand2 = hand.clone();
			char[] hand3 = hand.clone();
			if (index < k) {
				switch (t.charAt(index)) {
					case 'r':
						hand1[index] = 'p';
						int a = check(index + 1, count + p, hand1);
						hand2[index] = 'r';
						int b = check(index + 1, count, hand2);
						hand3[index] = 's';
						int c = check(index + 1, count, hand3);
						return Math.max(a, Math.max(b, c));
					case 's':
						hand1[index] = 'p';
						a = check(index + 1, count, hand1);
						hand2[index] = 'r';
						b = check(index + 1, count + r, hand2);
						hand3[index] = 's';
						c = check(index + 1, count, hand3);
						return Math.max(a, Math.max(b, c));
					case 'p':
						hand1[index] = 'p';
						a = check(index + 1, count, hand1);
						hand2[index] = 'r';
						b = check(index + 1, count, hand2);
						hand3[index] = 's';
						c = check(index + 1, count + s, hand3);
						return Math.max(a, Math.max(b, c));
				}
			} else {
				switch (t.charAt(index)) {
					case 'r':
						if (hand[index % k] != 'p') {
							count += p;
							hand1[index % k] = 'p';
							return check(index + 1, count, hand1);
						} else {
							hand2[index % k] = 'r';
							int a = check(index + 1, count, hand2);
							hand3[index % k] = 's';
							int b = check(index + 1, count, hand3);
							return Math.max(a, b);
						}
					case 's':
						if (hand[index % k] != 'r') {
							count += r;
							hand1[index % k] = 'r';
							return check(index + 1, count, hand1);
						} else {
							hand2[index % k] = 'p';
							int a = check(index + 1, count, hand2);
							hand3[index % k] = 's';
							int b = check(index + 1, count, hand3);
							return Math.max(a, b);
						}
					case 'p':
						if (hand[index % k] != 's') {
							count += s;
							hand1[index % k] = 's';
							return check(index + 1, count, hand1);
						} else {
							hand2[index % k] = 'r';
							int a = check(index + 1, count, hand2);
							hand3[index % k] = 'p';
							int b = check(index + 1, count, hand3);
							return Math.max(a, b);
						}
				}
			}
			
			return 0;
		}
	}
}
