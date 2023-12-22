
import java.util.Arrays;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int K;
    private Num[] numArray;

    public Main() {
	N = Integer.parseInt(scan.next());
	K = Integer.parseInt(scan.next());
	numArray = new Num[N];
	IntStream.range(0, N).forEach(i -> {
		int A = Integer.parseInt(scan.next());
		long B = Long.parseLong(scan.next());
		numArray[i] = new Num(A, B);
	    });
	scan.close();
    }

    public final void answer() {
	long[] value = new long[K+1];
	Arrays.fill(value, Long.MIN_VALUE);
	value[0] = 0;

	for(Num num: numArray) {
	    long[] newValue = Arrays.copyOf(value, value.length);
	    for (int i = 0; i <= K ; i++) {
		int index = i | num.A;
		if(value[i] > -1 && index <= K) {
		    newValue[index] = Long.max(value[index], value[i] + num.B);
		}
	    }
	    value = newValue;
	}

	OptionalLong result = Arrays.stream(value).max();
	System.out.println(result.getAsLong());
    }

    private static class Num {
	int A;
	long B;

	public Num(int a, long b) {
	    A = a;
	    B = b;
	}
    }
}
