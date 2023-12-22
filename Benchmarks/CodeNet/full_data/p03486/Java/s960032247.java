import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String n=sc.next();
		char a[]=s.toCharArray();
		char b[]=n.toCharArray();
		a=sort(a);
		s=new String(a);
		b=sort(b);
		n=new String(b);
		boolean c=true;
		if(a.length<b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					c=false;
				}
			}
		}

		if(s.compareTo(n)==1||c)
			System.out.print("Yes");
		else
			System.out.print("No");



	}
	public static char[] sort(char[] s) {
		for(int i=0;i<s.length-1;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					char h=s[i];
					s[i]=s[j];
					s[j]=h;
				}
			}
		}
		return  s;
	}

}