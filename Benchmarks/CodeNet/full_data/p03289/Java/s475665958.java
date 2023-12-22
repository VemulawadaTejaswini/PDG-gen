import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		char[] s = r.toCharArray();
		String ans = "AC";
		int i;
		int c=0;
		if((s[0]!='A')||(Character.isUpperCase(s[1]))) {
			ans = "WA";
		}else {
			for(i=2;i<r.length()-2;i++) {
				if(!(Character.isLowerCase(s[i]))) {
					if(s[i]!='C') {
						ans = "WA";
						break;
					}else {
						c++;
						if(c>1) {
							ans ="WA";
							break;
						}
					}
				}
			}
			if(c!=1) {
				ans="WA";
			}else {
				for(i=r.length()-2;i<r.length();i++) {
					if(Character.isUpperCase(s[i])) {
						ans = "WA";
						break;
					}
				}
			}
		}
		System.out.println(ans);

	}
}