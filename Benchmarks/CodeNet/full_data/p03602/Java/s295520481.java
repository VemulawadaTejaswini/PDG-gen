import java.util.*;

// 考察：
// 二つの都市を通るエッジは、同じ行・列にある一つの都市のみを通るエッジを一つずつ引っ張ってきたものの和
// 同様に、三つの都市を通るエッジは、二つの都市までを通るエッジの和
// 各行で最小の値を引いてきたものは必ず一都市のみを通るエッジ

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    private static int solve(Scanner scanner) {
        int result = 0;

        // 探索キュー
        Queue<Integer> qi = new LinkedList<>();
        Queue<Integer> qj = new LinkedList<>();

        // 既に展開したエッジのリスト
        List<Integer> vi = new ArrayList<>();
        List<Integer> vj = new ArrayList<>();

        // 確実な１都市エッジを列挙
        int N = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[][];
        for (int i = 0; i < N; i ++) {
            int min = Integer.MAX_VALUE;
            int minJ = -1;
            String[] split = scanner.nextLine().split(" ");
            for (int j = i + 1; j < N; j ++) {
                matrix[i][j] = Integer.parseInt(split[j]);
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    minJ = j;
                }
            }
            qi.add(i);
            qj.add(minJ);

            vi.add(i);
            vj.add(minJ);

            result += min;
        }

        // 残りの1都市エッジを全て列挙したのち2都市以上のエッジについて以下を確認
        // 確定エッジの交差点(elm)全てが１都市エッジの和(sum)になっていることを確認
        // 和になっていない場合：
        //   sum > elm の場合はそこが1都市エッジ
        //   sum < elm の場合は return -1
        Queue<Integer> qiNext = new LinkedList<>();
        Queue<Integer> qjNext = new LinkedList<>();
        while(true) {
            if (qi.size() != qj.size() || qiNext.size() != qjNext.size() || vi.size() != vj.size()) {
                throw new RuntimeException();
            }

            if (qi.isEmpty() && qiNext.isEmpty()) {
                break;
            } else if (qi.isEmpty()) {
                qi = qiNext;
                qj = qjNext;

                qiNext = new LinkedList<>();
                qjNext = new LinkedList<>();
            }

            int i = qi.poll();
            int j = qj.poll();

            for (int k = 0; k < vi.size(); k ++) {
                int ii = vi.get(k);
                int jj = vi.get(k);

                if (i == ii || j == jj) {
                    continue;
                } else {
                    int sum = matrix[i][j] + matrix[ii][jj];
                    int iii, jjj;
                    if (i < ii && j > jj) {
                        iii =
                    }
                    if (sum > )
                }
            }
        }
    }
}

