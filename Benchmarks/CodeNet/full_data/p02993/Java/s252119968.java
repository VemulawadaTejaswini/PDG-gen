import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char s2[] = s.toCharArray();
		Arrays.sort(s2);
		char t = s2[0];
		sc.close();
		String ans[] = {"Bad", "Good"};
		int an = 1;
		for(char tmp : s2) {
			if(t == tmp) {
				an = 0;
				break;
			}
			else t = tmp;
		}
		
		System.out.println(ans[an]);
	}
}
