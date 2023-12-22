import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] c=s.toCharArray();
		int cnt=1;
		for(int i=1;i<c.length;i++) {
			if(Character.getNumericValue(c[i-1])==Character.getNumericValue(c[i])) {
				cnt++;
				if(cnt==3)break;
			}else {
				cnt=1;
			}
		}
		System.out.println((cnt==3)? "Yes":"No");
	}
}