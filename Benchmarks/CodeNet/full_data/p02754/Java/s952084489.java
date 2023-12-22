import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 先頭からn番目まで
        int a = Integer.parseInt(sc.next()); // 青のボール
        int b = Integer.parseInt(sc.next()); // 赤のボール
        int sumOfBall = a + b; // 青と赤のボールの合計数
        int sumOfBlue = (n / sumOfBall) * a; // 青と赤のボールを1単位
        sumOfBlue += n % sumOfBall;
        System.out.println(sumOfBlue);
        sc.close();
    }
}
