import java.util.*;
public class Main {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int i=0;
			int j=s.length()-1;
			int ind1=0;
			int count=0;
			int count2=0;
			int ind2=0;
			while(i<j) {
				if(s.charAt(i)=='A'&&count<1) {
					ind1=i;
					count++;
				}if(s.charAt(j)=='Z'&&count2<1) {
					ind2=j;
					count2++;
				}
			
				i++;
				j--;
			}
			System.out.println(ind2-ind1+1);

	}

}
