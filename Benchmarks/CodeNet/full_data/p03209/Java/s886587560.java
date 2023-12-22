import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main implements Runnable {

    private long n;
    private long x;
    
    public static void main(String[] args) throws IOException {
        Main c = new Main();
	c.run();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    String[] parts = br.readLine().split("[\\s]+");
	    n = Long.parseLong(parts[0]);
	    x = Long.parseLong(parts[1]);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	set();
	long num = 0;
	for (long i=1;i<=x;i++) {
	    if (getBurger(n,i).equals("P")) num++;
	}
	System.out.println(num);
    }
    
    private String getBurger(long level,long idx) {
	if (level == 0) return "P";
        if (idx == 1) return "B";
        long end = pow(2,level+2)-3;
        long mid = end/2;
        if (idx == mid) return "P";
        if (idx == end) return "B";
        long i = idx < mid ? idx-1 : idx-mid;
        return getBurger(level-1,i);
    }

    private long pow(long base,long power) {
	if (power == 0) return 1;
	if (power%2 == 0) {
	    long h = pow(base,power/2);
	    return h*h;
	} else {
	    return base*pow(base,power-1);
	}
    }
}