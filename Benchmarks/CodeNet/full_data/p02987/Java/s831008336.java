
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "No" ;
		int n1 = 1;
		int n2 = 1;
		String[] ss = s.split("");
		if(ss[0].equals(ss[1])) {
			n1 = 2;
			if(ss[3].equals(ss[2])) {
				n2 = 2;
			}
		}else {
			if(ss[1].equals(ss[2])) {
				n2 = 2;
				if(ss[3].equals(ss[0])) {
					n1 = 2;
				}
			}
		}
		if(n1 == 2 && n2 == 2) {
			ans = "Yes";
		}
		System.out.println(ans);
		sc.close();
	}
}
