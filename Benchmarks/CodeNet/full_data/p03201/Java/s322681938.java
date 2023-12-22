import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Main {

    private int n;
    private long[] a;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Integer.parseInt(br.readLine());
	    a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong)
		.map(i -> -i).sorted().map(i -> -i).toArray();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    private void solve() {
	set();
	int pair = 0;
	double loge2 = Math.log(2);
	for (int i=0;i<n;i++) {
	    if (a[i] < 0) continue;
	    int t = (int)(Math.log(a[i])/loge2) + 1;
	    long p = (1 << t) - a[i];
	    for (int j=i+1;j<n;j++) {
		if (a[j] < 0) continue;
		if (p > a[j]) break;
		if (a[j] == p) {
		    a[j] = -1;
		    pair++;
		    break;
		}
	    }
	}
	System.out.println(pair);
    }
}