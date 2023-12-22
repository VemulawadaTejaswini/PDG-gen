import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, max = 0;
		int N = sc.nextInt();
		String s = sc.next();
		for(int i = 0;i < N;i ++) {
			char c = s.charAt(i);
			if(c == 'I') x ++;
			else x --;
			if(max < x)max = x;
		}
		System.out.println(max);
	}
}