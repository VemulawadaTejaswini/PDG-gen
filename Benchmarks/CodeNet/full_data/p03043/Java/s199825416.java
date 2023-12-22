import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        double total_rate = 0;

        for (int p = 1; p <= n; p++){
            double rate = 1.0/n;
            int now = p;
            while(now <= k-1){
                now = now * 2;
                rate = rate/2;
            }
            total_rate += rate;
        }

        System.out.print(total_rate);

    }
}


