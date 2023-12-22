
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private PriorityQueue<Data> dataQueue;

    public Main() {
	int N = Integer.parseInt(scan.next());
	dataQueue = new PriorityQueue<Data>(N);
	IntStream.range(0, N).forEach(i -> {
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		dataQueue.add(new Data(A, B));
	    });
	scan.close();
    }

    public final void answer() {
	Data minData = dataQueue.poll();
	int result = minData.A + minData.B; 
	System.out.println(result);
    }

    private static class Data implements Comparable<Data> {
	int A;
	int B;

	public Data(int A, int B) {
	    this.A = A;
	    this.B = B;
	}

	@Override
	public int compareTo(Data o) {
	    return -(this.A - o.A);
	}
    }
}
