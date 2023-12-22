import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = stdR.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);
        if(N / 2 + N % 2 >= K) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
