import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c = s.toCharArray();
		char str[]=new char[3];
		int i;
		int count=0;
		for(i=0;i<c.length-2;i++) {
			if(c[i]=='A'&&c[i+1]=='B'&&c[i+2]=='C') {
				//swap
				c[i]='B';
				c[i+1]='C';
				c[i+2]='A';
				count++;
				//i=0
				i=0;
			}
		}
		System.out.println(count);
	}

}
