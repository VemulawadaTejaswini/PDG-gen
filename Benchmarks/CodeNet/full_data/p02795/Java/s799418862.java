import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int paint = Math.max(H,W);

        int ans = (N +paint-1) / paint;

        System.out.println(ans);

    }
}




