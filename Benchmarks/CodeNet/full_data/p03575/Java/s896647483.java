import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        
        // data: m組の辺i, jのデータ
        int[][] data = new int[m][2];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s);
            data[i][0] = s;
            data[i][1] = t;
        }
        
        // 各辺を封鎖した時、依然連結グラフか調べる
        int count = 0;
        int start = 0;
        for (int i = 0; i < m; i++) {
            // 封鎖する
            int tmps = data[i][0];
            int tmpt = data[i][1];
            
            Queue<Integer> que = new ArrayDeque<Integer>();
            que.add(start);
            
            boolean[] visited = new boolean[n];
            visited[start] = true;
            
            // BFSで各点を訪れる
            while (!que.isEmpty()) {
                int p = que.poll();
                
                for (Integer q : to[p]) {
                    // System.out.println(i + " " + (p+1) + " " + (q+1));
                    if (!visited[q]) {
                        boolean canPass = !((p == tmps && q == tmpt) || (p == tmpt && q == tmps));
                        
                        if (canPass) {
                            que.add(q);
                            visited[q] = true;
                            // System.out.println(q+1);
                        }
                    }
                }
            }
            
            // 全点訪れられなかった
            // -> その辺は不可欠な辺
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}