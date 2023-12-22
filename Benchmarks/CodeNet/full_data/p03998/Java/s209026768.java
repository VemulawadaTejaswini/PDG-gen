import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S[] = new String[3];
		for (int i = 0; i < 3; i++) {
			S[i] = sc.next();
		}
		int a[] = new int[3];
		int now = 0;
		while (true) {
			int temp = now;
			if (S[now].length()==a[now]) {
				switch(now) {
				case 0: System.out.println("A");return;
				case 1: System.out.println("B");return ;
				case 2: System.out.println("C");return ;
				}
			}
			switch (S[now].charAt(a[now])) {
			case 'a':
				now = 0;
				break;
			case 'b':
				now = 1;
				break;
			case 'c':
				now = 2;
				break;
			}
			a[temp]++;
		}
	}
}
