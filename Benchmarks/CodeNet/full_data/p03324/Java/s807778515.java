import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        sc.close();
        int ans = (int) (Math.pow(100, D) * N);
        System.out.println(ans);

    }

}
