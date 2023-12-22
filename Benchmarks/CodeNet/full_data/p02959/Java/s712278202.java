import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=0; i<n+1; i++) {
            a[i] = sc.nextInt();
        }
        long sum=0;
        for (int i=0; i<n; i++) {
            int b = sc.nextInt();
            if (a[i] > b ) {
                a[i]-=b;
                sum+=b;
            }
            else {
                int c=b-a[i];
                sum+=a[i];
                a[i]=0;
                if (a[i+1] > c ) {
                    a[i+1]-=c;
                    sum+=c;
                }
                else {
                    sum+=a[i+1];
                    a[i+1] = 0;
                }
            }
        }

        System.out.println(sum);
    }
}
