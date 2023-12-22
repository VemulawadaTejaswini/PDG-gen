import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long base = 0;
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            if(i%2==0) base += a[i];
            else base -= a[i];
        }

        for(int i = 0; i<n; i++) {
            if(i!=0) base = 2*a[i-1] - base;
            System.out.println(base);
        }
    }
}