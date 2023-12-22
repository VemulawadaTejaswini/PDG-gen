import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		
		for(int i=0;i<s.length;i++) {
			s[i] = 'x';
		}
		
		System.out.println(s);
	}
}
