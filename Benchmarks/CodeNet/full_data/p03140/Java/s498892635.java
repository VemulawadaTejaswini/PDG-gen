import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();
		int count=0;
		for(int i=0;i<n;++i) {
			if(a.charAt(i)==b.charAt(i)&&a.charAt(i)==c.charAt(i));
			else if(a.charAt(i)==b.charAt(i)||a.charAt(i)==c.charAt(i)||
					b.charAt(i)==c.charAt(i)) count=count+1;
			else count=count+2;
		}
		
		System.out.println(count);
	}
}
