import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		sc = null;
		int cnt=0;
		for(i=0; i<s.length(); i++) {
			if(s.charAt(i)=='1') cnt++;
		}
		System.out.println(cnt);
	}
}
