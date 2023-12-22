import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int w = sc.nextInt();
		String ans = "";
		
		for(int i = 0; i < s.length; i++){
			if(i%w==0) ans += String.valueOf(s[i]);
		}
		System.out.println(ans);
	}
}