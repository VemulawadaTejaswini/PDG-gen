import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,Q;
		N=sc.nextInt();
		Q=sc.nextInt();
		String S=sc.next();
		int l[]=new int[Q];
		int r[]=new int[Q];
		for(int i=0;i<Q;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
			
		}
		for(int i=0;i<Q;i++) {
			String temp=S.substring(l[i]-1,r[i]);
			int count=0;
			int before=temp.length();
			temp=temp.replaceAll("AC", "");
			int after=temp.length();
			count=(before-after)/2;
			System.out.println(count);
			
		}
		
		
		
		
	}

}