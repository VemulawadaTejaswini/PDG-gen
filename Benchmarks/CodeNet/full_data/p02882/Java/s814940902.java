import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double x=s.nextInt();

		int v=a*a*b;
		double r=0;
		if(x*2>=v){
			System.err.println("high");
			r=(v-x)*2/a/a;
			System.out.println(90-Math.atan2(r,a)/Math.PI*180);
		}else{
			System.err.println("low");
			r=x*2/a/b;
			System.out.println(90-Math.atan2(r,b)/Math.PI*180);
		}
		System.err.println(r);
	}
}
