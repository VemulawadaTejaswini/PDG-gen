

import java.util.Scanner;

public class Main {
    static long N;
    static long C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long res = 0;
        func(0, 0);
        System.out.println(C);
    }

    static void func(long cur, int use) {
        if(cur > N) return;
        if(use == 0b111) {
            C++;
        }

        // 7 を付け加える
        func(cur * 10 + 7, use | 0b001);

        // 5 を付け加える
        func(cur * 10 + 5, use | 0b010);

        // 3 を付け加える
        func(cur * 10 + 3, use | 0b100);
    }
}
