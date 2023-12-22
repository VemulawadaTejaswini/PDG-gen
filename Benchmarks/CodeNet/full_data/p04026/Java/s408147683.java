import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String s=in.next();
		int b=-1;
		int a=-1;
		int c=1;
		int subL=0;
		double res=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i!=j) {
					c++;
					a=Math.min(i+1,j+1);
					b=Math.max(i+1,j+1);
				}
				subL=b-a+1;
				
				res=(double)subL/2;
				
			
			}
			if(subL>2 && c>res) {
				System.out.println(a+" "+b);
				break;
			}
			c=1;
			subL=0;
			res=0;
			a=-1;
			b=-1;
			if(i==s.length()-1 && c==1)
				System.out.println(a+" "+b);
		}
	}
}