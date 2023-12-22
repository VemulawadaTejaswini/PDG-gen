import java.util.*;
public class Main{
	public static void main(String [] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		int c[]=new int [a];
		int c1[]=new int [a];
		for(int i=0;i<a;i++) {
			c1[i]=x.nextInt();
			c[i]=x.nextInt();
		}
		int min=9999;
		for(int i=0;i<a;i++) {
			if(c[i]<=b&&min>c1[i])
			{
				min=c1[i];
				
			}
		}
		if(min==9999) {
			System.out.println("TLE");
		}
		else {
			System.out.println(min);
		}
	}
}
