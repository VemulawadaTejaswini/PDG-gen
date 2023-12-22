import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        A: for(int i = 1; i <= sum / 2; i++) {
            if(sum % i != 0) continue;
            int div = sum / i;

            int minus = 0;
            int plus = 0;

            int[] b = new int[n];


            for(int j = 0; j<n; j++) {
                b[j] = a[j] % div;
            }
            Arrays.sort(b);
            int l = 0;
            int r = n - 1;
            while(l <= r) {
                if (minus < plus) {
                    minus += b[l];
                    if(minus > k) continue A;
                    l++;
                } else {
                    plus += div - b[r];
                    if(plus > k) continue A;
                    r--;
                }
            }
            System.out.println(div);
            return;
        }

        System.out.println(1);
    }

}
