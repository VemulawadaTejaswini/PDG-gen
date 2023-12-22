import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int T = Integer.parseInt(sc.next());
	int c[] = new int[N];
	int t[] = new int[N];
	for (int i = 0; i < N; i++) {
	    c[i] = Integer.parseInt(sc.next());
	    t[i] = Integer.parseInt(sc.next());
	}

	int minT = t[0];
	for (int i = 1; i< N; i++) {
	    int v = t[i];
	    if (v < minT) {
		minT = v;
	    }
	}

	int minC = c[0];
	for (int i = 0; i < N; i++) {
	    int v = t[i];
	    int w = c[i];
	    if (v <= T && w < minC) {
		minC = w;
	    }
	}

	if (T < minT) {
	    System.out.println("TLE");
	} else {
	    System.out.println(minC);
	}
    }
}
