import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int D=stdIn.nextInt();
		int E=stdIn.nextInt();
		int a=(A/5+1)*5-A,b=(B/5+1)*5-B,c=(C/5+1)*5-C,d=(D/5+1)*5-D,e=(E/5+1)*5-E;
		int max=0;
		if(a>max&&a!=5)
			max=a;
		if(a==5)
			a=0;
		if(b>max&&b!=5)
			max=b;
		if(b==5)
			b=0;
		if(c>max&&c!=5)
			max=c;
		if(c==5)
			c=0;
		if(d>max&&d!=5)
			max=d;
		if(d==5)
			d=0;
		if(e>max&&e!=5)
			max=e;
		if(e==5)
			e=0;
		System.out.println(A+B+C+D+E+a+b+c+d+e-max);
	}
}