import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		sc = null;
		int cnt1=0;
		int cnt2=0;
		char[] zerone = {'0', '1'};
		for(i=0; i < s.length(); i++) {
			if(s.charAt(i) == zerone[i%2]) {cnt1++;}
			else {cnt2++;}
		}
		System.out.println(min(cnt1, cnt2));
	}
}