import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		scan.close();
		char sc[]=s.toCharArray();
		char tc[]=t.toCharArray();
		for(int i=0;i<s.length();i++) {
			int cnt=0;
			for(int j=i;j<s.length()+i;j++) {
				if(tc[cnt]==sc[j%s.length()]) {
					cnt++;
					if(cnt==s.length()) {
						System.out.println("Yes");
						break;
					}
				}else break;
			}
			if(cnt==s.length()) {
				break;
			}else if(i==s.length()-1)System.out.println("No");
		}
	}

}
