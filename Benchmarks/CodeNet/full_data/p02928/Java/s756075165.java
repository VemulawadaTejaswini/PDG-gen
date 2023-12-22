import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long k = stdIn.nextLong();
        int[] a = new int[n];
        for(int i = 0;i<n;i++) {
            a[i] = stdIn.nextInt();
        }
        long count = 0;
        int[] b = new int[n];
        for(int i = 0;i<a.length;i++) {
            for(int j = i+1;j<a.length;j++) {
                if(a[i] > a[j]) {
                    b[i]++;
                }
            }
        }
        Arrays.sort(a);
        int c = 0;
        for(int i = 0;i<a.length;i++) {
            for(int j = i+1; j<a.length;j++) {
                if(a[i] < a[j]) {
                    c++;
                }
            }
        }
        //System.out.println(c);

        for(int i = 0;i<a.length;i++) {
            count += sum(b[i],k);
            count = count % (1000000007);
        }
        long t = k-1;
        count += sum(c,t);
        //System.out.println(sum(c,t));
        count %= 1000000007;
        System.out.println((count));
    }

public static long sum(int a,long k) {
    long goukei = 0;
    goukei = a * (k*(k+1)/2);
    return goukei % (1000000007);
    }
}