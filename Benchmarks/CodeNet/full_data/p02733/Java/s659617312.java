import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();   // 1 ~ 10
        int W = sc.nextInt();   // 1 ~ 1000
        int K = sc.nextInt();
        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                S[i][j] = Integer.parseInt(s.substring(j, j+1));
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < H; i++){
            list.add(i);
        }
        int minDivide = (H - 1) + (W - 1);
        for (int i = 0; i < H; i++) {
            for (ArrayList<Integer> l : getCombination(list, i)) {
                ArrayList<Integer> L = new ArrayList<Integer>();
                int numDivide = l.size();   // 横の切り方
                L.add(0);
                L.addAll(l);
                L.add(H);
                numDivide += countDivideW(S, L, K); // 縦の切り方
                System.out.print(l);
                System.out.println(numDivide);
                if (numDivide < minDivide) {
                    minDivide = numDivide;
                }
            }
        }
        System.out.println(minDivide);
    }

    public static int countDivideW(int[][] S, ArrayList<Integer> L, int K) {
        int count = 0;
        int curr = 0;
        int[] sum = new int[L.size() - 1];
        int[] currSum = new int[L.size() - 1];
        for (int n = 0; n < L.size() - 1; n++){
            sum[n] = 0;
            currSum[n] = 0;
        }
        while (curr < S[0].length) {
            boolean divide = false;
            for (int h = 0; h < L.size() - 1; h++) {
                currSum[h] = 0;
                for (int i = L.get(h); i < L.get(h + 1); i++) {
                    currSum[h] += S[i][curr];
                }
                if (sum[h] + currSum[h] > K) {
                    divide = true;
                    if (currSum[h] > K) { // 1列でオーバーする場合(横方向の分割がダメ)
                        count = (S.length - 1) + (S[0].length - 1);
                    }
                }
            }
            if (divide) {
                for (int h = 0; h < L.size() - 1; h++) {
                    sum[h] = currSum[h];
                }
                count++;
            } else {
                for (int h = 0; h < L.size() - 1; h++) {
                    sum[h] += currSum[h];
                }

            }
            curr++;
        }
        return count;
    }

    public static Set<ArrayList<Integer>> getCombination(
        ArrayList<Integer> n, Integer r) {
        Set<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();
        combination(n, r, ans);
        return ans;
    }

    public static void combination(
        ArrayList<Integer> n, Integer r, Set<ArrayList<Integer>> ans) {
        if (n.size() == r) {
            ans.add(n);
            return;
        }
        for (int i = 0; i < n.size(); i++) {
            ArrayList<Integer> N = new ArrayList<Integer>();
            Collections.sort(N);
            N.addAll(n);
            N.remove(i);
            combination(N,r,ans);
        }
    }

}
