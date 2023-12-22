import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		char[] c=sc.next().toCharArray();
		int cnt=0,ans=0;
		for (char d : c) {
			if(d!='A' && d!='C' && d!='G' && d!='T') {
				ans= Math.max(ans, cnt);
				cnt=0;
				continue;
			}
			cnt++;
		}
		System.out.println(ans);
	}
}
