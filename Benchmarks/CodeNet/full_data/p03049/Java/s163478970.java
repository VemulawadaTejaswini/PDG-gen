import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	long cnt = 0;
	long a = 0;
	long b = 0;
	long ab = 0;
	for(int i = 0; i<n; i++) {
	    String s = sc.next();
	    cnt += (s.length() - s.replace("AB","").length()) / 2;
	    if(s.charAt(0) == 'B' && s.charAt(s.length()-1) == 'A') ab++;
	    else if(s.charAt(0) == 'B') b++;
	    else if(s.charAt(s.length()-1) == 'A') a++;
	}

	long ans = Math.min(a,b) + ab +cnt;
	if(ab == n) ans = ab -1 +cnt;


	System.out.println(ans);

    }
}