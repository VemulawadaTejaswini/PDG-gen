import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),a,b,c,d;
		sc.close();
		a=n/1000%10;
		b=n/100%10;
		c=n/10%10;
		d=n%10;
		if(a+b+c+d==7) System.out.print(a+"+"+b+"+"+c+"+"+d+"=7");
		else if(a-b+c+d==7) System.out.print(a+"-"+b+"+"+c+"+"+d+"=7");
		else if(a+b-c+d==7) System.out.print(a+"+"+b+"-"+c+"+"+d+"=7");
		else if(a+b+c-d==7) System.out.print(a+"+"+b+"+"+c+"-"+d+"=7");
		else if(a-b-c+d==7) System.out.print(a+"-"+b+"-"+c+"+"+d+"=7");
		else if(a-b+c-d==7) System.out.print(a+"-"+b+"+"+c+"-"+d+"=7");
		else if(a+b-c-d==7) System.out.print(a+"+"+b+"-"+c+"-"+d+"=7");
		else System.out.print(a+"-"+b+"-"+c+"-"+d+"=7");
	}
}