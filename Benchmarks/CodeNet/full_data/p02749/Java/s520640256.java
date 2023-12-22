
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static Map<Integer, List<Integer>> tree = new HashMap<>();;

    public static void main(String[] args) {
        // とりあえず木を表現してみる
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            Integer a = Integer.valueOf(sc.nextInt());
            Integer b = Integer.valueOf(sc.nextInt());

            if (!tree.containsKey(a)) {
                tree.put(a, new ArrayList<>());
            }
            tree.get(a).add(b);
        }

        // とりあえず距離が3の頂点の組をつくってみる
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        // - 自分自身と深さが3のやつら
        for (int i = 1; i <= N; i++) {
            Integer m = Integer.valueOf(i);
            for (Integer p : getDepth3(Integer.valueOf(i))) {
                listA.add(m);
                listB.add(p);
            }
        }

        // - 深さ1と深さ2のやつら
        for (int i = 1; i <= N; i++) {
            Integer m = Integer.valueOf(i);
            List<Integer> dep1 = getDepth1(m);
            List<Integer> dep2 = getDepth2(m);

            for (Integer h : dep1) {
                for (Integer p : dep2) {
                    listA.add(h);
                    listA.add(p);
                }
            }
        }
        // なんかフツーのグラフができてしまった。 そりゃそうか。
        // ここまでの処理でTLEとかしたらウケるので提出してみる。 
    }

    private static List<Integer> getDepth3(Integer moto) {
        return tree.get(moto).stream()
                .map(tree::get)
                .flatMap(List::stream)
                .map(tree::get)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static List<Integer> getDepth2(Integer moto) {
        return tree.get(moto).stream()
                .map(tree::get)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static List<Integer> getDepth1(Integer moto) {
        return tree.get(moto);
    }

}
