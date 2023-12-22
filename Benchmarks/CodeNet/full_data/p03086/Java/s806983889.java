import java.util.*;
 
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
 
		String s =sc.next();
		char c[]=s.toCharArray();
		int count=0;
		int max=0;
		
		for( int i=0;i<s.length();++i) {
			if (c[i]=='A' ||c[i]=='C' ||c[i]=='G' ||c[i]=='T') {
				++count;
				max=Math.max(count, max);
			}
			else count=0;
		}
		
		System.out.println(max);

	}
	
}