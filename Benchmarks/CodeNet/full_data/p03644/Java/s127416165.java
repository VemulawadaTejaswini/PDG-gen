// https://atcoder.jp/contests/abc068/tasks/abc068_b

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        //1以上100以下の整数の中で最も2で割れる回数が多いのは64(2^6)
        int ans = 64;

        //64以下の整数で、次に割れる回数が多いのは32(2^5)
        while( N < ans ) {
            ans /= 2;
        }

        System.out.println(ans);
    }
}

    
