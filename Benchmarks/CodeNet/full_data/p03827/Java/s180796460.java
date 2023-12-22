import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		String s = sc.next();
		int x = 0 ;
		for(int i = 0;i < n;i++) {
			char c = s.charAt(i);
			if(c == 'I') {
				x++;
			}else if(c == 'D') {
				x--;
			}
			if(x >= max) {
				max = x;
			}
		}
		System.out.println(max);
	}
}
