import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
        
		String s=in.next();
		String x=s;
		int c=0;
		for (int i = 1; i < s.length()-1; i++) {
			if(s.charAt(i-1)!=s.charAt(i+1)) {
				c++;
				s=s.substring(0,i)+s.substring(i+1,s.length());
				i=i-1;
			}
		}
		if(c%2==0) 
			System.out.println("Second");
		else
			System.out.println("First");
	}
}
