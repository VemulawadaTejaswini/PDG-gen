package app;

import java.util.Scanner;

public class SampleA {
    public static void main(String[] args) {
    // 入力された値をすべてスキャン
    Scanner sc = new Scanner(System.in);

    // 一行目の値を得る
    String line = sc.nextLine();

    // 半径を取得
    int r = Integer.parseInt(line);

    // 出力
    System.out.println(r * r);

    // Scannerを閉じる
    sc.close();
    }
}