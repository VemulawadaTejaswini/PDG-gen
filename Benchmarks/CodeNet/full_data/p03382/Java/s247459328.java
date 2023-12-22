import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int m = a[n-1];
        int l = 0;
        int max = 0;
        int k = 0;

        for(int i=0; i<n-1; i++) {
            if(a[i]*2 < m) {
                l = a[i];
            } else {
                l = m - a[i];
            }
            if(max < l) {
                max = l;
                k = a[i];
            }
        }

        System.out.println(m + " " + k);
    }

}
