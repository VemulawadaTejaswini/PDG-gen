
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a=scn.nextLong();
		long b=scn.nextLong();
		long c=scn.nextLong();
		long d=scn.nextLong();
		long cy=b/c;
		long dy=b/d;
		long ans=0;
		long cx=a/c;
		if(a%c!=0) {
			cx++;
		}
		long dx=a/d;
		if(a%d!=0) {
			dx++;
		}
		if(c%d==0) {
		 ans=b-a+1-(dy-dx+1);

		}else if(d%c==0) {
		 ans=b-a+1-(cy-cx+1);

		}else {
			 ans=b-a+1-(dy-dx+1)-(cy-cx+1)+1;

		}
		System.out.println(ans);
		//System.out.println(cx+" "+cy+" "+dx+" "+dy);
	}

}
