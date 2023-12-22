import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int max = Math.max(A,Math.max(B,C));
        int ans = A+B+C-max+max*(1<<K);
        System.out.println(ans);
    }
}