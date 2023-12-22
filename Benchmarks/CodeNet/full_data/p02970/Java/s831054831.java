import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.close();
        double ans = (double)N / (1+2*D);
        System.out.println((int)Math.ceil(ans));
        

    }
}