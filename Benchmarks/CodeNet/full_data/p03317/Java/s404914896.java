import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = (N-1) / (K-1);
        ans += (N-1) % (K-1) == 0 ? 0 : 1;
        System.out.println(ans);
        sc.close();

    }

}
