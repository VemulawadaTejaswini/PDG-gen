import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main implements Runnable {

    private int n;
    private long x;
    
    public static void main(String[] args) throws IOException {
        Main c = new Main();
	c.run();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    String[] parts = br.readLine().split("[\\s]+");
	    n = Integer.parseInt(parts[0]);
	    x = Long.parseLong(parts[1]);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	set();
	long[] length = new long[n+1];
	long[] number = new long[n+1];
	length[0] = 1;
	number[0] = 1;
	for (int i=1;i<n+1;i++) {
	    length[i] = 2*length[i-1]+3;
	    number[i] = 2*number[i-1]+1;
	}
	long num = 0;
	long rem = x;
	for (int i=n;i>=0;i--) {
	    if (rem == 1) break;
	    if (i == 0) {
		num++;
		break;
	    }
	    if (rem == length[i]) {
		num += number[i];
		break;
	    }
	    if (rem == length[i-1]+2) {
		num += number[i-1]+1;
		break;
	    } else if (rem < length[i-1]+2) {
		rem = rem - 1;
	    } else {
		rem = rem - (length[i-1]+2);
		num += number[i-1]+1;
	    }
	}
	System.out.println(num);
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