import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
	for (int i=0; i<n; i++) {
	    a[i] = sc.nextInt();
	    b[i] = a[i];
	}
	Arrays.sort(b);
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<n; i++) {
	    if (b[n-1] == a[i]) sb.append(b[n-2]+"\n");
	    else { sb.append(b[n-1]+"\n"); }
	}
	System.out.print(sb.toString());
    }
}
