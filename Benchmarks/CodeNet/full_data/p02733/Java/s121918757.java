import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }

        System.out.println(solve(H, W, K, S));
    }

    private static int solve(int H, int W, int K, String[] S) {
        int k = 0;

        // 2次元累積和を用いて任意の矩形領域内のビット総和をO(1)で計算できるようにする
        int[][] sum = new int[H+1][W+1];
        for (int h=1; h<H+1; h++) {
            for (int w=1; w<W+1; w++) {
                sum[h][w] = sum[h-1][w] + sum[h][w-1] - sum[h-1][w-1] + (S[h-1].charAt(w-1) - '0');
            }
        }

        // 総ビット数から最小の分割数が定まるので，それ以下の分割はスキップする
        while (sum[H][W] > K*Math.pow(2, k)) {
            k++;
        }

        while(!canDivide(H, W, K, S, sum, k)) {
            k++;

            // 実装があやしく，分割可能な分割数でも分割できないと判定されてしまう
            // 分割可能な上限(H+W-2)を超えたらエラーにする
            if (k > (H-1)+(W-1)) {
                throw new RuntimeException("too many k=" + k + " > " + (H+W));
            }
        }

        return k;
    }

    /**
     * 与えられたグリッドが k 分割可能か判定する
     * @param H
     * @param W
     * @param K
     * @param S
     * @param sum
     * @param k 分割数
     * @return true if 指定の条件の下でk分割可能 false otherwise
     */
    private static boolean canDivide(int H,int W, int K, String[] S, int[][] sum, int k) {
        // System.err.println("\ncheck if it is possible to divide with k=" + k);
        if (k ==0) {
            return sum[H][W] <= K;
        }

        for (int a=Math.min(H-1, k); a>=0; a--) {
            int b = k - a;
            if (b >= W) {
                break;
            }

            System.err.println("cut a=" + a + " times in horizontally, b=" + b + " times in vertically");

            if (b == 0) {
                for (int abit=0; abit<Math.pow(2, H); abit++) {
                    if (sumBit(abit) != a) continue;

                    if (bitSearch(H, W, K, S, sum, k, a, b, abit)) {
                        return true;
                    }
                }
            } else {
                for (int abit=0; abit<Math.pow(2, H); abit++) {
                    if (sumBit(abit) != a) continue;

                    // System.err.println("try abit pattern "+ abit);
                    if (bitSearch(H, W, K, S, sum, k, a, b, abit)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * 縦横の切る回数および横に切る位置を決めたとき，各セルのホワイトチョコがK以下にできるか判定する
     * @param H
     * @param W
     * @param K
     * @param S
     * @param sum
     * @param k
     * @param a 横に切る回数
     * @param b 縦に切る回数 (b != 0)
     * @param abit 横に切る位置
     * @return
     */
    private static boolean bitSearch(int H, int W, int K, String[] S, int[][] sum, int k, int a, int b, int abit) {
        int preCutW = 0;
        List<Integer> idx = toBitIdx(abit);
        idx.add(0, 0);
        idx.add(H);


        for (int numCut=0; numCut<b; numCut++) {
            // preCutW から preCutW+nextLineの列を切る
            for (int nextLine=0; preCutW+nextLine<=W; nextLine++) {
                // 横にidx.get(i)とidx.get(i+1)で切ったとき縦に切る場所を貪欲で求める
                for (int i=0; i<idx.size()-1; i++) {

                    if (count(sum, idx.get(i), preCutW, idx.get(i+1), preCutW+nextLine+1) > K) {
                        // nextLine+1だとダメなセルがあるのでnextLineで切るのが適切
                        if (nextLine == 0) {
                            // 1列のカットも許されない場合はそのabitは不適切
                            return false;
                        }

                        // System.err.println("\tcut in " + (preCutW+nextLine) + " seems good! count=" + numCut);
                        preCutW += nextLine;
                        nextLine = W+1; // break nextLine loop
                        break;
                    }
                }
            }
        }

        // 一番右端の各セルのチェック
        for (int i=0; i<idx.size()-1; i++) {
            if (count(sum, idx.get(i), preCutW, idx.get(i+1), W) > K) {
                // System.err.println("numCut(" + numCut + ") expect equal to k(" + k + "), all cut OK in " + abit);
                return false;
            }
        }

        // System.err.println("good pattern: " + a + ", " + b + ", " + abit);
        return true;
    }

    private static List<Integer> toBitIdx(int abit) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        while (abit > 0) {
            if (abit%2 == 1) {
                list.add(idx);
            }

            idx++;
            abit /= 2;
        }
        return list;
    }


    private static int count(int[][] count, int i, int j, int x, int y) {
        int val = count[x][y] - count[i][y] - count[x][j] + count[i][j];
        // System.err.println("\tcount from (" + i + "," + j + ") -> (" + x + "," + y +") = " + val);
        return val;
    }

    private static int sumBit(int bit) {
        int sum = 0;

        while (bit > 0) {
            sum += bit%2;
            bit /= 2;
        }

        return sum;
    }
}