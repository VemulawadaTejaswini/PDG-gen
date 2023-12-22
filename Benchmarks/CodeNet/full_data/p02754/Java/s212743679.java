import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long ans = 0l;
        ans +=N / (A + B) * A;

        long mod = N % (A+B);

        if(mod > A){
            ans += A;
        } else {
            ans += mod;
        }

        System.out.println(ans);


    }

}







