import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        long[]  c = new long[N];
        while(i<=N){
            int cur = in.nextInt();
            c[i-1]= (long) Math.abs(cur-i);
            i++;
        }
        Arrays.sort(c);
        long ans = 0;
        for(int k=0;k<=(N/2-1);k++){
            ans +=  c[N-1-k]-c[k];
        }
        System.out.println(ans);
    }
}