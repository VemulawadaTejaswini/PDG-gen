import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String str=scan.next();
		int ans=0;
		for(int i=0;i<b;i++){
			int c=scan.nextInt();
			int d=scan.nextInt();
			String S=str.substring(c-1,d);
			int count=0;
			for(int j=1;j<S.length();j++) {
				char one=S.charAt(j-1);
				char two=S.charAt(j);
				if(one=='A'&&two=='C') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	}