import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[sc.nextInt()-1] += 1;
        }

        int count = 0;
        int target = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] > 0) {
                count += 1;
            }
            if(count > k) {
                target += a[i];
            }
        }

        if(count > k) {
            System.out.println(target);
        } else {
            System.out.println(0);
        }
    }
}
