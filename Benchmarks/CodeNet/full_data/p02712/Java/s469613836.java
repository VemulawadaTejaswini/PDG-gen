
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i=1L;
        long tot = 0L;
        while(i<=n){
            if(i%3!=0 && i%5!=0){
                tot+=i;
            }
            i++;
        }
        System.out.println(tot);
    }
}

