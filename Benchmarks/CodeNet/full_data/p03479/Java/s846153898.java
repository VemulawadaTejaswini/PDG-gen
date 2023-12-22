import java.lang.Math;

public class Main{
	public static void main(String args[]){
		long x = Long.valueOf(args[0]);
		long y = Long.valueOf(args[1]);

		long p = 0;
		while(x * Math.pow(2,p) < y){
			p++;
		}
		System.out.println(p);
	}
}