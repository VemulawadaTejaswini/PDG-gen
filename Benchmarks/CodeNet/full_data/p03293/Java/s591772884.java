import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String[] t = sc.next().split("");
		for(int i = 0;i <s.length;i++) {
			boolean sameFlag = true;
			for(int j = 0;j < s.length;j++) {
				if(!s[j].equals(t[j])) {
					sameFlag = false;
					break;
				}
			}
			if(sameFlag) {
				System.out.println("Yes");
				return;
			}
			String taihi = s[s.length-1];
			for(int k =s.length-1; k >0 ;k--) {
				s[k] = s[k-1];
			}
			s[0] = taihi;
		}
		System.out.println("No");
	}
}