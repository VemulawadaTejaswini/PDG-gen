import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int tmp;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if (i>0) {
                if (a[i-1] > a[i]) {
                    tmp = a[i-1]; a[i-1] = a[i]; a[i] = tmp;
                }
            }
        }
        int numFoundPair = 0;
        long area = 1;
        boolean swapped;
        for (int i=n-3; i>=0; i--) {
            swapped = false;
            for (int j=0; j<=i; j++) {
                if ( a[j] > a[j+1] ) {
                    tmp = a[j]; a[j] = a[j+1]; a[j+1] = tmp;
                    swapped = true;
                }
            }
            if (a[i+1] == a[i+2]) {
                area *= a[i+1];
                a[i+1] *= -1; a[i+2] *= -1;
                numFoundPair++;
            }
            if (numFoundPair==2) {
                System.out.println(area);
                return;
            }
            if (!swapped) {
                // the sequence is already sorted
                for (int j=i; j>=0; j++) {
                    if (a[i] == a[i+1]) {
                        area *= a[i];
                        a[i+1] *= -1; a[i+2] *= -1;
                        numFoundPair++;
                    }
                    if (numFoundPair==2) {
                        System.out.println(area);
                        return;
                    }
                }
                System.out.println(0);
                return;
            }
        }
        if (a[0] == a[1]) {
                area *= a[0];
                System.out.println(area);
                return;
            }
        System.out.println(0);
    }
}
