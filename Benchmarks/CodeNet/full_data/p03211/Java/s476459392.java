import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		s = sc.next();
		sc.close();
		
		int x, min, ans = 753, k = 0;
		min = 753;
		String s2[];
		s2 = new String[9];
		
		for(int i = 0; i < s.length() - 2; ++i) {
			s2[k] = "";
			for(int j = i; j < i + 3; ++j) {
				s2[k] += s.charAt(j);
			}
			++k;
		}
		
		for(int i = 0; i < 9; ++i) {
			if(s2[i] != null) {
				x = Integer.parseInt(s2[i]);
				x = Math.abs(x - 753);
				min = Math.min(min, x);
			}
		}
		
		System.out.println(min);
	}

}
