import java.util.*;
 
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int q=sc.nextInt();
		
		int l[]=new int[q];
		int r[]=new int[q];
		int num[]=new int[n];
		
		String s =sc.next();
		char c[]=s.toCharArray();
		
		int count=0;
		int max=0;
		
		for(int i=0;i<q;++i) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		
		for( int i=s.length()-1;i>=0;--i) {
			if (c[i]=='C') {
				if(i-1>=0 && c[i-1]=='A') {
					++count;				
				}
			}
			if (i-1>=0)num[i-1]=count;	
		}
		
		for (int i=0;i<q;++i) {
			System.out.println(num[l[i]-1]-num[r[i]-1]);
		}

	}
	
}