import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		int b = sc.nextInt();
		int[] c=new int[6];
		int cou=0;
		for(long i=a;i<=b;i++) {
			long d=i;
		    int e=10000;
			int sum=0;
			for(int k=0;k<=4;k++) {
				sum+=d%10*e;
				e/=10;
				d/=10;
			}
			if(i==sum)cou++;
		}
		System.out.println(cou);
	}
}