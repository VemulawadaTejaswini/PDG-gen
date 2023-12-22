import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		scan.close();
		char c[]=s.toCharArray();
		char sc[]=new char[2];
		int cnt[]= {1,0};
		sc[0]=c[0];
		int suffix=0;
		for(int i=1;i<c.length;i++) {
			if(c[i]==sc[0]) {
				cnt[0]++;
			}else {
				if(suffix==0) {
					sc[1]=c[i];
					cnt[1]++;
					suffix=1;
				}else {
					if(c[i]==sc[1])cnt[1]++;
				}
			}
		}
		if(cnt[0]==2&&cnt[1]==2)System.out.println("Yes");
		else System.out.println("No");
	}
}