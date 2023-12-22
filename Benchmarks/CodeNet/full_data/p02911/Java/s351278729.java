import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		int q = sc.nextInt();
        int[] a = new int[q];

        for(int i = 0; i < q; i++){
            a[i] = sc.nextInt();
        }

        long[] p = new long[n];
        Arrays.fill(p, 0);

        for(int i = 0; i < q; i++){
            p[a[i] - 1]++;
        }

        for(int i = 0; i < n; i++){
            if(p[i] > q - k) System.out.println("Yes");
            else System.out.println("No");
        }

    }

}
