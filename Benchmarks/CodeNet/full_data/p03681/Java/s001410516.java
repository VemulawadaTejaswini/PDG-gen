import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        long ans = 1;

        for(int i = Math.min(n, m); i > 0; i--){
            ans = (ans % 1000000007) * i;
        }
        ans *= ans % 1000000007;
        if(n == m){
            ans *= 2;
        }else{
            ans *= Math.max(n, m);
        }
        System.out.println(ans % 1000000007);
    }
}
