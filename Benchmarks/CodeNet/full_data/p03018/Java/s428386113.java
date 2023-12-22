import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int ans=0;
		for(;;) {
			int co=0;
		for(int i=0;i<str.length()-2;i++) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(i+1);
			char ch3=str.charAt(i+2);
			if(ch1=='A'&&ch2=='B'&&ch3=='C') {
				ans++;
				co++;
				str=str.substring(0,i)+"BCA"+str.substring(i+3,str.length());
			}
		}
		if(co==0) {
			break;
		}
		}
		System.out.println(ans);
	}
}
