

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Double N = sc.nextDouble();
        Double D = sc.nextDouble();
        int ans = (int)Math.ceil(N / (2 * D + 1));
        System.out.println(ans);
        sc.close();
    }
}