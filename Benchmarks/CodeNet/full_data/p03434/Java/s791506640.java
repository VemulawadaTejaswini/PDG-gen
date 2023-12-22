import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] s = stdR.readLine().split(" ");
        int[] a = new int[N];
        for(int i = 0 ; i < N ; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        int count = 0;
        for(int i = N - 1 ; i >= 0 ; i--) {
            if(count % 2 == 0) {
                alice += a[i];
            }else {
                bob += a[i];
            }
            count++;
        }
        System.out.println(alice - bob);
    }
}