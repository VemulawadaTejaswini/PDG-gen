import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A >= K) { System.out.println(1); return; }
        if (A <= B) { System.out.println(-1); return; }
        int ans = (K-A)/(A-B);
        if ((K-A) % (A-B) != 0) {
            ans++;
        }
        ans = 2*ans+1;

        System.out.println(ans);
    }
}
