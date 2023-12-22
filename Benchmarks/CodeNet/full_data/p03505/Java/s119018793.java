import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A >= K) { System.out.println(1); return; }
        if (A <= B) { System.out.println(-1); return; }
        
        long ans = (K-A)/(A-B);
        if ((K-A) % (A-B) != 0) {
            ans++;
        }
        ans = 2*ans+1;

        System.out.println(ans);
    }
}
