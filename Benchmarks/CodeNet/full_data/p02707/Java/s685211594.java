import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a;	//a[0]:A1
        a = new int[n];

        for (int i=1; i<n; i++) {
        	a[i] = 0;
        }

        for (int i=1; i<n; i++) {
        	a[(scan.nextInt())-1] += 1;
        }

        for (int i=0; i<n; i++) {
			System.out.println(a[i]);
        }
	    scan.close();	
    }
}