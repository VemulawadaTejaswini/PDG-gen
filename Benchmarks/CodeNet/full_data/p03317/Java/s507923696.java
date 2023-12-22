import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int min = 100000;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(min > a[i]) min = a[i];
        }
        int count = 0;
        for(int i=0; i<n; i++) {
            if(min == a[i]) count++;
        }
        if((n-count) % (k-1) == 0) System.out.println((n-count)/(k-1));
        else System.out.println(((n-count)/(k-1)) +1);
    }
}
