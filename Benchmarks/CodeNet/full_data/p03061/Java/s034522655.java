import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> AiList = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            AiList.add(sc.nextInt());
        }

        sc.close();

        //----------入力値の格納----------

        //N=2の場合
        if ( N == 2) {

            Nis2(AiList.get(0), AiList.get(1));
        }

        //最大公約数の出力値
        int max = 0;

        for (int i = 0; i < N; i++) {

            Integer temp = AiList.get(i);
            AiList.remove(i);

            int g = gcd(AiList.get(0), AiList.get(1));

            for (int n = 1; n < AiList.size() - 1; n++) {

                g = gcd(g, AiList.get(n + 1));
            }

            max = (max < g) ? g : max;


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

        if( a % b == 0 ) {

            return b;
        }

        return gcd( b, a % b );
    }
}
