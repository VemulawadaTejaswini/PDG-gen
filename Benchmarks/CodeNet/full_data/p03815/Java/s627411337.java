import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long ans=0;

		long mod=x%11;
		long tmp=(x-mod)/11;
		if(mod==0) ans=tmp*2;
		else if(mod>=1 && mod<=6) ans=tmp*2+1;
		else ans=tmp*2+2;

		System.out.println(ans);
	}
}