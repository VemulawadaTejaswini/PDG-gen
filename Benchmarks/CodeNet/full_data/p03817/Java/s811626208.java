import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=n/11;
		long y=n%11;
		x*=2;
		if(y<=6&&y!=0)
			x+=1;
		else
			x+=2;
		System.out.print(x);
	}
}