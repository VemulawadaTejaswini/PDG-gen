import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = A + B;
        // Nを指定した場合のあまり
        long L = N % C;
        // 計算用
        long target = A * (N / C) + Math.min(L, A);
        // 出力
        System.out.println(target);
    }
}