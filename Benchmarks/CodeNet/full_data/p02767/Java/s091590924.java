
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0; i < N; i++)
            x[i] = sc.nextInt();

        Arrays.sort(x);

        int sum = 0;
        for(int p = x[0]; p <= x[N - 1]; p++) {
            int tmp = 0;
            for(int i = 0; i < N; i++) 
                tmp += (x[i] - p) * (x[i] - p);
            
            if(p == x[0]) sum = tmp;
            if(tmp <= sum) sum = tmp;
        }

        System.out.println(sum);
    }

}
