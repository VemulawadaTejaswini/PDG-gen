import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()); // リンゴ
        int p = Integer.parseInt(sc.next()); // リンゴの欠片
        p += a * 3; // リンゴ1個からリンゴの欠片3個作成
        int answer = p / 2; // リンゴの欠片2個でアップルパイ1個作成
        System.out.println(answer);
        sc.close();
    }
}