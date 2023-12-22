import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //個数
        int n = sc.nextInt();

        //数
        long[] x = new long[n];
        long[] s = new long[n];
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
            s[i] = x[i];
        }

        long ans;
        for(int i = 0;i < n;i++){
            x[i] = 0;
            //ソート
            Arrays.sort(x);
            ans = x[n/2];
            System.out.println(ans);
            System.arraycopy(s,0,x,0,s.length);
        }
    }
}