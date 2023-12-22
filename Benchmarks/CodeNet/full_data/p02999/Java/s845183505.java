import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long k = stdIn.nextLong();
        long[] a = new long[n];
        for(int i = 0; i < n ; i++) {
            a[i] = stdIn.nextLong();
        }
 
        long count = 0;
        for(int i = 0;i < n; i++) {
            long sum = 0;
            for(int j = i;j < n;j++) {
                sum += a[j];
                if(sum >= k) {
                    count += (n - j);
                    break;
                }
            }
        }
        System.out.println(count);
 
    }
}