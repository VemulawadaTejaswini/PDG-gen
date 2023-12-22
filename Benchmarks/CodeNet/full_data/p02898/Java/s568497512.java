import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 人数
        int k = Integer.parseInt(sc.next()); // 制限身長
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(sc.next()); // 各自の身長
            if (k <= h) {
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}