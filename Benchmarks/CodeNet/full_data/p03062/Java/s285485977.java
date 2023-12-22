import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long first = 0;
        long last = 0;
        long sum = 0;
        int[] a = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if(tmp <= 0) count++;
            a[i] = Math.abs(tmp);
            if(i == 0) {
                first -= a[i];
            } else {
                first += a[i];
            }
            if(i == n-1) {
                last -= a[i];
            } else {
                last += a[i];
            }
            sum += a[i];
        }

        if(count % 2 == 0) {
            System.out.println(sum);
        } else {
            System.out.println(Math.max(first, last));
        }

       

    }
}