
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		char[] s = sc.next().toCharArray();
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		for (int i=0;i<s.length-2;i++) {
			q.offer(i);
		}
		
		int count = 0;
		while (!q.isEmpty()) {
			int x = q.poll();
			
			if (s[x]=='A' && s[x+1]=='B' && s[x+2]=='C') {
				count++;
				s[x]='B';
				s[x+1]='C';
				s[x+2]='A';
				if (x>=1) {
					q.offer(x-1);
				}
				if (x<s.length-4) {
					q.offer(x+2);
				}
			}
		}
		System.out.println(count);
	}
}
