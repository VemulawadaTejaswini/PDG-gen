import java.util.Scanner;

/**
 * A - ABC Swap
 * 3  つの箱 A,B,C があります。
 * それぞれの箱には、整数が 1 つ入っています。
 * 現在、箱 A,B,C に入っている整数はそれぞれ X,Y,Z です。
 * これらの箱に対して以下の操作を順に行った後の、それぞれの箱に入っている整数を求めてください。
 * 箱 A と箱 B の中身を入れ替える箱 A と箱 C の中身を入れ替える
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された整数
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println( z + " " + x + " " + y );

        sc.close();
    }
}