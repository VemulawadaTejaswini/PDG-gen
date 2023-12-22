import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
      	long chai=B-A+1;
		System.out.println(B-A -((chai/C)+(chai/D)-(chai/(C*D/uqrid(C,D)))));
	}
	static long uqrid(long C,long D){
		long dai=Math.max(C,D);
		long shou=Math.min(C,D);
		long amari=0;
		for(;amari!=0;){
          	amari=dai%shou;
			dai=shou;
			shou=amari;
		}
		return shou;
	}
}

