import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] res = new int[n];

        for(int i=1; i<=n-1; i++) {
            for(int j=i+1; j<=n; j++) {
                int d = j - i;
                d = Math.min(d, Math.abs(i-x) + Math.abs(j-y) + 1);
                d = Math.min(d, Math.abs(i-y) + Math.abs(j-y));
                d = Math.min(d, Math.abs(i-x) + Math.abs(j-x));
                res[d]++;
            }
        }



        for(int i=1; i<n; i++) {
            System.out.println(res[i]);
        }

    }


}