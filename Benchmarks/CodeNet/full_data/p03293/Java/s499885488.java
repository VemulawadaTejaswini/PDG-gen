import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		int time = ac.length;
		while(time != 0) {
			
			if(Arrays.equals(ac, bc)) {
				break;
			}else {
				time--;
				rotate(ac);
			}
		}
		
		if(time == 0) {
			System.out.printf("No");
		}else {
			System.out.printf("Yes");
		}
		
		sc.close();
	}
	
	public static void rotate(char[] c) {
		char t = c[c.length-1];
		for(int i = c.length-2; i >= 0; i--) {
			c[i+1] = c[i];
		}
		c[0] = t;
	}
}