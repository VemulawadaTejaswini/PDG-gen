import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ai = new int[N];
        List<Integer> AiList = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            Ai[i] = sc.nextInt();
            AiList.add(Ai[i]);
        }

        sc.close();

        //----------入力値の格納----------

        //N=2の場合
        if ( N == 2) {

            Nis2(Ai[0], Ai[1]);
        }

        //最大公約数の出力値
        int max = 0;

        for (int i = 0; i < N; i++) {

        	Integer temp = AiList.get(i);
            AiList.remove(i);

            if (max < getGCD(AiList)) {

                max = getGCD(AiList);
            }

            AiList.add(i, temp);
        }

        System.out.println(max);

    }

    //N=2の場合
    public static void Nis2 (int a, int b) {

        System.out.println(Math.max(a, b));
        System.exit(0);
    }

    //2数の最大公約数を求める関数
    public static int gcd (int a, int b) {

         //引数の大小入替
        if( a < b ) {

            int temp = a; a = b; b = temp;
        }

        if( a % b == 0 ) {

            return b;
        }

        return gcd( b, a % b );
    }

    //配列に格納されている数値の最大公約数を求める関数
    public static int getGCD (List<Integer> list) {

        int len = list.size();
        int g = gcd(list.get(0), list.get(0));

        for (int i = 1; i < len - 1; i++) {

            g = gcd(g, list.get(i + 1));
        }
        return g;
    }