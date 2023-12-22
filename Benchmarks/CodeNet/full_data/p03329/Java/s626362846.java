import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = n;

        for(int i=0; i<=n; i++) {
            int n6 = i;
            int n9 = n - i;

            int d9 = 9 * 9 * 9 * 9 * 9;
            int d6 = 6 * 6 * 6 * 6 * 6 * 6;

            int sum = 0;
            while(d9 >= 1) {
                int div = n9 / d9;
                sum += div;
                n9 %= d9;
                d9 /= 9;
            }
            while(d6 >= 1) {
                int div = n6 / d6;
                sum += div;
                n6 %= d6;
                d6 /= 6;
            }

            res = Math.min(res, sum);

        }

        System.out.println(res);
    }

}
