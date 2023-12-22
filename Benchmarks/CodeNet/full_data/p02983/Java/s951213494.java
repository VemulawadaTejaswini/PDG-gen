
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int l=scn.nextInt();
		int r=scn.nextInt();
		if((2019<l||r<2019)&&r-l<2019) {
			l=l%2019;
			r=r%2019;
			if(l<r)
			func(l,r);
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void func(int l, int r) {
		
		int min=Integer.MAX_VALUE;
		for(int i=l;i<r;i++) {
			for(int j=i+1;j<=r;j++) {
				int x=(i*j)%2019;
				if(x<min) {
					min=x;
				}
			}
		}
		System.out.println(min);

	}

}
