import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n+1];
	int[] b = new int[n];
	for (int i=0; i<n+1; i++) a[i] = sc.nextInt();
	for (int i=0; i<n; i++) b[i] = sc.nextInt();
	long count = 0;
	int nokori = 0;
	int carry = 0;
	int teki;
	for (int i=0; i<n; i++) {
	    nokori = b[i];
	    teki = a[i] - carry;
	    if (nokori >= teki) {
		nokori -= teki;
		count += teki;
		if (nokori >= a[i+1]) {
		    carry = a[i+1];
		    count += a[i+1];
		} else {
		    carry = nokori;
		    count += nokori;
		}
	    } else {
		carry = 0;
		count += nokori;
	    }
	}
	System.out.print(count);
    }
}
