import java.util.Scanner;
public class Main {

//最小公倍数lcm
static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		long d = stdIn.nextLong();
		
		/*long cnt = 0;
		for(long i = a; i <= b; i++) {
			if(i%c!=0 && i%d != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		*/
		
		long acnt = b/c; //cで割り切れる数
		long bcnt = b/d;
		long l = lcm(c,d);
		long abcnt = b/l;
		
		long atemp = (a-1)/c;
		long btemp = (a-1)/d;
		long abtemp = (a-1)/l;
		
		long atmp = acnt-atemp;
		long btmp = bcnt-btemp;
		long abtmp = abcnt - abtemp;
		
		long ans = (b-a+1)-(atmp+btmp-abtmp);
		System.out.println(ans);
	}

}
