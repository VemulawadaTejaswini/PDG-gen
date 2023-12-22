import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int a,b,r,gcd,lcm;
		long num,answer;
		sc.close();
		if(C>=D) {
			a=C;
			b=D;
		}else {
			a=D;
			b=C;
		}
		gcd=a/b;
		r=a%b;
		while(a%b!=0) {
			gcd=a/b;
			r=a%b;
			a=b;
			b=r;
		}
		lcm=C*D/gcd;
		num=(B-A+1)/C+(B-A+1)/D-(B-A+1)/lcm;
		answer=(B-A+1)-num;
		System.out.println(answer);
	}
}