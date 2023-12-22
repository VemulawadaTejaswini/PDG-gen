package atCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ai = new int[N];

        List<ArrayList<Integer>> AiList = new ArrayList<>();

        //NC2回の全ての組み合わせに対して2つのAiの最大公約数を格納するList
        List<Integer> GreatestCommonDivisorList = new ArrayList<>();

        //2つのAiの最大公約数
        Integer GreatestCommonDivisorPair = 0;

        //最大公約数
        int ans = 0;

        for (int i = 0; i < N; i++) {

            Ai[i] = sc.nextInt();
        }

        //N=2の時は2つのAiの内大きいほう
        if ( N == 2) {

            if (Ai[0] >= Ai[1]) {

                System.out.println(Ai[0]);

                sc.close();
                System.exit(0);
            } else {

                System.out.println(Ai[1]);
                sc.close();
                System.exit(0);
            }
        }


        //Aiごとに1以外の約数を算出
        for (int i = 0; i < N; i++) {

            ArrayList<Integer> factoring = new ArrayList<>();

            for(int n = 2; n-1 < Ai[i]; n++) {

                if(Ai[i] % n == 0) {

                    factoring.add(n);
                }
            }

            AiList.add(factoring);
        }

        //NC2回の全ての組み合わせに対して最大公約数をListに格納

        //1つめのAi,A1,A2・・・A(N-1)
        for (int hoge = 0; hoge < N-1; hoge++) {


            //1つ目のAiに対し、A(i+1),A(i+2)・・・ANの配列を比較させる
            for (int foo = hoge+1; foo < N; foo++) {

                //1つ目のAiの約数の配列を全て取り出す
                for (int n  = 0;  n  < AiList.get(hoge).size(); n++) {

                    //2つ目のAiの約数の配列を全て取り出す
                    for (int f = 0; f < AiList.get(foo).size(); f++) {

                        if(AiList.get(hoge).get(n).equals(AiList.get(foo).get(f))) {

                            if (AiList.get(hoge).get(n) > GreatestCommonDivisorPair) {
                                GreatestCommonDivisorPair = AiList.get(hoge).get(n);
                            }
                            continue;
                        }
                    }
               }
                GreatestCommonDivisorList.add(GreatestCommonDivisorPair);
                GreatestCommonDivisorPair = 0;
            }

        }

// ---------ここまでok

//      GreatestCommonDivisorList = GreatestCommonDivisorList.stream().distinct().collect(Collectors.toList());
        //GreatestCommonDivisorListを昇順にする
        Collections.sort(GreatestCommonDivisorList);

        Map<Integer,Integer> map = GreatestCommonDivisorList.stream().collect(
                Collectors.groupingBy(
                        //MapのキーにはListの要素をそのままセットする
                        Function.identity(),
                        //Mapの値にはListの要素を1に置き換えて、それをカウントするようにする
                        Collectors.summingInt(s->1))
                );

        //GreatestCommonDivisorListの要素の種数に応じてansを出力
        //GreatestCommonDivisorListの最小の要素の数がN-1以上の場合
        if(map.get(GreatestCommonDivisorList.get(0)).compareTo(N-1) == 1) {

            //最小の数が0の場合は最大公約数は1
            if (map.get(GreatestCommonDivisorList.get(0)).equals(0)) {

                System.out.println(1);
                sc.close();
                System.exit(0);
            }

            //GreatestCommonDivisorListの最小の要素の数がN-1以上の場合は最小の要素が最大公約数になる
            System.out.println(GreatestCommonDivisorList.get(0));
            sc.close();
            System.exit(0);
        }

        int second = 1;

        //二番目に小さい数が最小公倍数
        for (int i = 1; i < GreatestCommonDivisorList.size(); i++) {

            if(GreatestCommonDivisorList.get(0).compareTo(GreatestCommonDivisorList.get(i)) != 0) {

                second = GreatestCommonDivisorList.get(i);
                System.out.println(second);
                sc.close();
                System.exit(0);
            }
        }
    }
}
