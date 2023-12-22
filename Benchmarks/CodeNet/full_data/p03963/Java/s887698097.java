import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long can = (long)Math.pow(2, 31)-1;
		long x = 1;
		if(a>b)
			x = 0;
		while(a-->0){
			x*=b;
			b--;
		}
		long sum = Math.min(can, x);
		System.out.print(sum);
	}
}
