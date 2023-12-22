import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0;
		boolean isEv = (k % 2 == 0);
		int nom = n / k;
		count += nom;
		count += nom * (nom - 1) * 3;
		count += nom * (nom - 1) * (nom - 2);
		if (k % 2 == 0) {
		    int ev = (n + k / 2) / k;
    		count += ev;
    		count += ev * (ev - 1) * 3;
    		count += ev * (ev - 1) * (ev - 2);
		}
        System.out.println(count);
	}
}
