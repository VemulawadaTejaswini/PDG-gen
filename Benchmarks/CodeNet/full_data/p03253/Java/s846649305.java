import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    private int n;
    private int m;
    private List<Long> primeFactors;
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
	primeFactors = new ArrayList<>();
	int num = m;
	for (long i=2;i<=num;i++) {
	    long count = 0;
	    while (num%i == 0) {
		count++;
		num /= i;
	    }
	    if (count > 0) primeFactors.add(count);
	    if (num == 1) break;
	}
    }

    private long solve() {
	long ans = 1;
	for (long v : primeFactors) {
	    ans = (ans*h(v,n))%d;
	}
	return ans%d;
    }

    private long h(long a,long b) {
	a = a+b-1;
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
	    long h = pinv(l,p/2)%d;
	    return (h*h)%d;
	} else {
	    return (l*pinv(l,p-1))%d;
	}
    }
}