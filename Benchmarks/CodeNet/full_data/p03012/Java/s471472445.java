import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] w = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
            sum+=w[i];
        }

        int l = 0;
        int r = sum;

        int res = 1000000000;

        for(int i=0; i<n-1; i++) {
            l+=w[i];
            r-=w[i];
            res = Math.min(res, Math.abs(l-r));
        }

        System.out.println(res);

    }


}
