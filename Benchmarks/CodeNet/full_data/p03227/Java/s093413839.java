import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		String b = "";
		char a[]=new char[5];
		int x=0,y=0;
		x=S.length();
		if(x==2)
			System.out.println(S);
		else {
			while(y<x) {
				a[y]=S.charAt(y);
				y++;
			}
			while(y!=-1) {
				b+=a[y];
				y--;
			}
			System.out.println(b);
		}
	}
}