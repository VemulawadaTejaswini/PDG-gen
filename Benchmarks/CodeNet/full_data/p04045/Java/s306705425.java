
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int K = Integer.parseInt(scan.next());
	int[] D = new int[K];
	for (int i = 0; i < K; i++) {
	    D[i] = Integer.parseInt(scan.next());
	}

	int money = N;
	for (; money <= 100000; money++) {
	    if(contains(money, D)) continue;
	    else break;
	}

	System.out.println(money);
	scan.close();
    }

    private static boolean contains(int x, int[] D) {
	boolean ans = false;
	while(x / 10 > 0) {
	    int r = x % 10;
	    x = x / 10;
	    for (int i = 0; i < D.length; i++) {
		if(r == D[i]) {
		    ans = true;
		    break;
		}
	    }
	    if(ans) break;
	}
	if(ans == false) {
	    for (int i = 0; i < D.length; i++) {
		if(x == D[i]) {
		    ans = true;
		    break;
		}
	    }
	}
	return ans;
    }
}
