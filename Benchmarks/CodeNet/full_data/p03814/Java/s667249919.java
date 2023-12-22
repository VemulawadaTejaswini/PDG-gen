import java.util.Scanner;
public class Main {
	//public static int N,K,a=-1;
	public static String ans="",s;

	//public static int a[][]=new int[5][5];

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char c[]=s.toCharArray();
		int start=0,last=0;
		for(int i=0;i<c.length;i++) {
			if(start==0&&c[i]=='A')start=i;
			if(c[i]=='Z'&&start>0) {
				last=i+1;
			}
		}
		System.out.println(last-start);
	}
}