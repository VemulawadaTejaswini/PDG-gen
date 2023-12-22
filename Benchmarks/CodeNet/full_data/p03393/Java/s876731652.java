import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		String s =sc.nextLine();
		
		char[] c=s.toCharArray();
		
		if(c.length==26) {
			for(int i=25;i>=0;i--) {
				for(int j=i+1;j<=25;j++) {
					if(c[i]<c[j]) {
						String ans="";
						for(int k=0;k<i;k++) {
							ans=ans+String.valueOf(c[k]);
						}
						ans=ans+String.valueOf(c[j]);
						System.out.println(ans);
						return;
						
					}
				}
			}
			System.out.println(-1);
			return;
		}
		
		else {
			char x='a';
			while(x<='z'){
				x=(char) (x+1);
				for(int i=0;i<c.length;i++) {
					if(x==c[i]) {
						continue;
					}
				}
				s=s+String.valueOf(x);
				System.out.println(s);
				return;
				
			}
		}
		
		
		
	}

}
