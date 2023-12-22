import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            while(i+1 < n && a[i] == a[i+1]) i++;
            if(i+1 < n && a[i] < a[i+1]) {
                while(i+1 < n && a[i] < a[i+1]) i++;
            } else if(i+1 < n && a[i] > a[i+1]) {
                while(i+1 < n && a[i] > a[i+1]) i++;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
