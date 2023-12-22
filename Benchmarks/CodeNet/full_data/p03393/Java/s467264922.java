import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		String s =sc.nextLine();
		
		char[] c=s.toCharArray();
		if(c.length==26) {
			for(int i=24;i>=0;i--) {
				char[] d=String.copyValueOf(c, i, c.length-i).toCharArray();
				Arrays.sort(d);
				for(int j=0;j<d.length;j++) {
					if(c[i]<d[j]) {
						String ans="";
						for(int k=0;k<i;k++) {
							ans=ans+String.valueOf(c[k]);
						}
						ans=ans+String.valueOf(d[j]);
						System.out.println(ans);
						return;
						
					}
				}
			}
			System.out.println(-1);
			return;
		}
		
		else {
			char x=(char)('a'-1);
			LOOP:while(x<='z'){
				x=(char) (x+1);
				for(int i=0;i<c.length;i++) {
					if(x==c[i]) {
						continue LOOP;
					}
				}
				s=s+String.valueOf(x);
				System.out.println(s);
				return;
				
			}
		}
		
		
		
	}

}
