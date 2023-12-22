import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	boolean[] cards = new boolean[n];
	int l,r;
	for (int i=0; i<m; i++) {
	    l = sc.nextInt()-1;
	    r = sc.nextInt()-1;
	    for (int j=0; j<l; j++) cards[j] = true;
	    for (int j=r+1; j<n; j++) cards[j] = true;
	}
	int count = 0;
	for (int i=0; i<n; i++)
	    if (cards[i] == false) count++;
	System.out.print(count);
    }
}
