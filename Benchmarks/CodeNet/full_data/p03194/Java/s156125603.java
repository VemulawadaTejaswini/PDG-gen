import java.util.*;
class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
	long P = sc.nextLong();
	long num = 1;
	long max = 1;
	long pmax = P;
	for(long i = 1; num<=P && num<=pmax;i++) {
	    if(P%num == 0) {
		max = i;
		pmax = P/i;
	    }
	    num = (long)Math.pow(i+1,N);
	}
	System.out.println(max);
    }
}