import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		//int d=scan.nextInt();
		//int f=scan.nextInt();
		String str=scan.next();
		boolean bool=false;
		String ans="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i+1==c) {
				ch=(char) (ch-'A'+'a');
			}
			ans+=ch;
		}
		System.out.println(ans);
	}
}
