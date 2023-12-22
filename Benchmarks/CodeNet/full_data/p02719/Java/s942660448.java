
import java.util.Scanner;

public class Main {

    static double N, K, ans, prevans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextDouble();
        K = sc.nextDouble();

        prevans = func0();
        for(;;){
            N = prevans;
            ans = func0();
            if(ans == prevans) {
                break;
            }
        }
        System.out.println((int)ans);
    }

    static double func0(){
        double ans1 = N - (K * Math.floor(N / K));
        return (double)((int) Math.min(ans1, K - ans1));
    }

}
