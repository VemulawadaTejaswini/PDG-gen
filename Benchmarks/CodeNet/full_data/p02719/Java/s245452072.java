
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        long n = Long.parseLong(in[0]);
        long k = Long.parseLong(in[1]);
        Set<Long> h = new HashSet<>();
        long diff = Math.abs(n-k);
        long max = Math.max(n,k);
        if(Math.min(n,k)==1L || diff == 0){
            System.out.println(0);
        } else {
            System.out.println(max - (max / diff) * diff);
        }
    }
}

