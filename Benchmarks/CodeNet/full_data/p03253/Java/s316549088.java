import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private int n;
    private int m;
    private Map<Long,Long> primeFactors;
    private final long d = 1000000007;
    
    public static void main(String[] args) {
	Main f = new Main();
	System.out.println(f.solve());
    }

    private Main() {
	set();
    }

    private void set() {
	n = m = 0;
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    int[] nm = Arrays.stream(br.readLine().trim().split("[\\s]+")).mapToInt(Integer::parseInt).toArray();
	    n = nm[0];
	    m = nm[1];
	} catch(IOException e) {
	    e.printStackTrace();
	}
	primeFactors = new HashMap<>();
	int num = m;
	while (num != 1) {
	    for (long i=2;i<=num;i++) {
		if (num%i == 0) {
		    num /= i;
		    if (!primeFactors.containsKey(i)) {
			primeFactors.put(i,(long)1);
			break;
		    } else {
			long tmp = primeFactors.get(i);
			tmp++;
			primeFactors.put(i,tmp);
		    }
		}
	    }
	}
    }

    private long solve() {
	long[] ans = {1};
	primeFactors.forEach((k,v) -> {
		ans[0] = (ans[0]*h(v,n))%d;
	    });
	return ans[0];
    }

    private long h(long a,long b) {
	return c(a+b-1,b);
    }

    private long c(long a,long b) {
	if (a-b < b) b = a-b;
	long u = 1;
	long l = 1;
	for (long i=0;i<=b;i++) {
	    u *= a-i;
	    u %= d;
	    l *= i+1;
	    l %= d;
	}
	return (u*pinv(l,d-2))%d;
    }

    private long pinv(long l,long p) {
	if (p == 0) return 1;
	if (p%2 == 0) {
	    long hp = p/2;
	    long h = pinv(l,hp)%d;
	    return (h*h)%d;
	} else {
	    return (l*pinv(l,p-1))%d;
	}
    }
}