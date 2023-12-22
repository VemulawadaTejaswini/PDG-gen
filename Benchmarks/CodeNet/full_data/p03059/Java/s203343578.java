import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ai = new int[N];
        List<ArrayList<Integer>> AiList = new ArrayList<>();
        List<Integer> GreatestCommonDivisorList = new ArrayList<>();
        int notMatch = 0;

        for (int i = 0; i < N; i++) {

            Ai[i] = sc.nextInt();
        }

        //Aiごとに素因数分解
        for (int i = 0; i < N; i++) {

            ArrayList<Integer> factoring = new ArrayList<>();

            for(int n = 2; n < Ai[i]; n++) {

                if(Ai[i] % n == 0) {

                    factoring.add(n);
                }

                AiList.add(factoring);
            }
        }

        int hoge = 0;

        //NC2回の全ての組み合わせに対して最大公約数をListに格納
        while (hoge < N-1) {

            int foo = hoge + 1;
            Integer GreatestCommonDivisor = 0;

            while(foo < N-1) {

                for (int n = 0; n < AiList.get(hoge).size(); n++) {

                    for (int nextAi = 0; nextAi < AiList.get(foo+1).size(); nextAi++) {

                        if(AiList.get(hoge).get(n) == AiList.get(foo+1).get(nextAi)) {

                            GreatestCommonDivisor = AiList.get(hoge).get(n);
                        }
                    }

                foo++;
                }
            }

            GreatestCommonDivisorList.add(GreatestCommonDivisor);

            if(GreatestCommonDivisor.equals(0)) {

                notMatch++;
            }
            hoge++;
        }

        //GreatestCommonDivisorListのsizeと最大公約数がない場合に応じてansを出力
        if (notMatch >= 2) {

            System.out.println(1);
        } else if ( N == 2) {

            if (Ai[0] >= Ai[1]) {

                System.out.println(Ai[0]);
            } else {

                System.out.println(Ai[1]);
            }
        } else {

            int max = 0;

            for (int i = 0; i < GreatestCommonDivisorList.size(); i++) {

                if (max < GreatestCommonDivisorList.get(i)) {

                    max = GreatestCommonDivisorList.get(i);
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}
