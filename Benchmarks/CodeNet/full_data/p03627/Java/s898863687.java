import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int tmp;
        int numFoundPair = 0;
        int area = 1;
        for (int i=n-1; i>0; i++) {
            for (int j=0; j<i; j++) {
                if ( a[j] > a[j+1] ) {
                    tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                }
            }
            if (i<n-1 && a[i] == a[i+1]) {
                area *= a[i];
                a[i] *= -1; a[i+1] *= -1;
                numFoundPair++;
            }
            if (numFoundPair==2) {
                System.out.println(area);
                return;
            }
        }
        System.out.println(0);
    }
}