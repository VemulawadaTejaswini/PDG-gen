
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int H;
    private int W;
    private int N;
    private int[] a;

    public Main() {
	H = Integer.parseInt(scan.next());
	W = Integer.parseInt(scan.next());
	N = Integer.parseInt(scan.next());
	a = new int[N];
	for (int i = 0; i < N; i++) {
	    a[i] = Integer.parseInt(scan.next());
	}
	scan.close();
    }

    public final void answer() {
	int[] number = new int[H*W];
	int index = 0;
	for (int i = 0; i < N; i++) {
	    for (int j = 0; j < a[i]; j++) {
		number[index] = i+1;
		index++;
	    }
	}

	StringBuilder str = new StringBuilder();
	for (int h = 0; h < H; h++) {
	    for (int w = 0; w < W; w++) {
		if(h%2 == 0) {
		    str.append(number[h*W + w]);
		} else {
		    str.append(number[(h+1)*W -1 - w]);
		}
	    }
	    str.append('\n');
	}

	System.out.println(str.toString());
    }
}
