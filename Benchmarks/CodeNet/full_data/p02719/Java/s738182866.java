import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lo = reader.readLine().split(" ");
        long N = Long.parseLong(lo[0]);
        long K = Long.parseLong(lo[1]);
        if(N<K){
            System.out.println(Math.min(N,Math.abs(N-K)));
        }
        else if(N>K){
            long q = N/K -1;
            N = N - q*K;
            N = Math.abs(N-K);
            System.out.println(Math.min(N,Math.abs(N-K)));
        }
        else System.out.println(0);
    }
}
