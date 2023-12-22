import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long N = Long.parseLong(sc.next());
	long cnt = 0;
	if(N==1) {
	    System.out.println(0);
	    return;
	}
	for(long i = 1; i*i<=N; i++) {
	    if(N%i == 0) {
		for(long j = N/i-1; N%j!=0; j--) {
		    if(N%j==N/j) {
			cnt+=j;
			break;
		    }
		}

	    }
	}
	System.out.println(cnt);
    }
}