import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String s=in.next();
		int a=-1;
		int b=-1;
		int c=0;
		int subL=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					a=i+1;
					b=j+1;
				}
				subL=b-a+1;
				if(subL>=2 && c>(double)subL/2) {
					System.out.println(a+" "+b);
					c=300;
					break;
				}
			
			}
			if(c==300)
				break;
			c=0;
			if(i==s.length()-1 && c==0)
				System.out.println(-1+" "+-1);
		}
	}
}