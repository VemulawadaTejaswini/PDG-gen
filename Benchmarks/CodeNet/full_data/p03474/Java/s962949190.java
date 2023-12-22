import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		String s=scanner.next();
		int i=0;
		for (i = 0; i < s.length(); i++) {
			if ((s.charAt(i)-'0')>=0&&(s.charAt(i)-'0')<=9) {
				continue;
			}else if (s.charAt(A)=='-') {
				continue;
			}else {
				break;
			}
			
		}
		if (i==A+B+1) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}