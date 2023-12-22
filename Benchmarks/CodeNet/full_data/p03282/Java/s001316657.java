import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	long K = sc.nextLong();
	long cnt = 0;
	for(int i = 0; i<S.length(); i++) {
	    int n = Character.getNumericValue(S.charAt(i));
	    int x = 5000;
	    for(int j = 0; j< 4; j++) {
		cnt = cnt + (long)Math.pow(n,x);
		if(cnt >= K) {
		    System.out.println(n);
		    return;
		}
		x = 1000;
	    }
	}
    }
}