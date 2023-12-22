import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = Long.parseLong(scan.next());
        long K = Long.parseLong(scan.next());
        long temp = 0;
        
        while(true)
        {
            if(N > K) temp = N - K;
            else temp = K - N;
            
            if(N > temp) N = temp;
            else break;
        }

        System.out.println(N);
        scan.close();
    }
}