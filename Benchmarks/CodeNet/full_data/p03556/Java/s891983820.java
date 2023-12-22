import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double k;
        k = Math.sqrt(N);
        double sq = Math.floor(k);
        int ans = (int) Math.pow(sq, 2);
        System.out.println(ans);
    }
}
