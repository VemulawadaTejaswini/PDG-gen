import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private int n;
    private List<Long> a;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Integer.parseInt(br.readLine());
	    a = Arrays.stream(br.readLine().split(" ")).map(Long::valueOf)
		.sorted().collect(Collectors.toList());
	    Collections.reverse(a);
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    private void solve() {
	set();
	int pair = 0;
	double loge2 = Math.log(2);
	while (!a.isEmpty()) {
	    Iterator<Long> it = a.iterator();
	    long ai = it.next();
	    it.remove();
	    int t = (int)(Math.log(ai)/loge2) + 1;
	    long p = (1 << t) - ai;
	    if (a.contains(p)) {
		pair++;
		a.remove(p);
	    }
	}
	System.out.println(pair);
    }
}