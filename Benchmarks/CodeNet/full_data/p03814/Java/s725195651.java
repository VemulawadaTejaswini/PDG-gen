import java.util.*;
public class Main {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
			String s=sc.next();
			
			int j=s.length()-1;
			int ind1=0;
			int count=0;
			int count2=0;
			int ind2=0;
			for(int i=0;i<j+1;i++) {
				if(s.charAt(i)=='A') {
					ind1=i;
					break;
				}
			}	for(int i=j;i>=0;i--) {
				if(s.charAt(i)=='Z') {
					ind2=i;
					break;
				}
			}
			if(ind2-ind1!=0) {
			System.out.println(ind2-ind1+1);
			}

	}

}
