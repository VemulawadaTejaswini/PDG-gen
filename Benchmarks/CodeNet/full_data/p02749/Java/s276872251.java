import java.util.*;

public class Main {
    static List<Integer>[] to; // 頂点iの隣接リスト
    static int ycount;
    static int rcount;
    static int bcount;
    static int n;
    static int[] color;
    static boolean ok;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        color = new int[n];
        ok = true;
        
        // 隣接リストの作成
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            to[p].add(q);
            to[q].add(p);
        }
        
        int max = 999999999;
        int min = -1;
        
        dfs(0, -1, 0, 1, 2);
        
        max = Math.max(ycount, rcount);
        max = Math.max(max, bcount);
        min = Math.min(ycount, rcount);
        min = Math.min(min, bcount);
        
        if (!ok || max - min > 1) {
            ok = true;
            ycount = rcount = bcount = 0;
            dfs(0, -1, 1, 2, 1);
            max = Math.max(ycount, rcount);
            max = Math.max(max, bcount);
            min = Math.min(ycount, rcount);
            min = Math.min(min, bcount);
            
            if (!ok || max - min > 1) {
                ok = true;
                ycount = rcount = bcount = 0;
                dfs(0, -1, 2, 1, 2);
                max = Math.max(ycount, rcount);
                max = Math.max(max, bcount);
                min = Math.min(ycount, rcount);
                min = Math.min(min, bcount);
                
                if (!ok || max - min > 1) {
                    ok = true;
                    ycount = rcount = bcount = 0;
                    dfs(0, -1, 1, 2, 0);
                    max = Math.max(ycount, rcount);
                    max = Math.max(max, bcount);
                    min = Math.min(ycount, rcount);
                    min = Math.min(min, bcount);
                
                    if (!ok || max - min > 1) {
                        ok = true;
                        ycount = rcount = bcount = 0;
                        dfs(0, -1, 2, 0, 0);
                        max = Math.max(ycount, rcount);
                        max = Math.max(max, bcount);
                        min = Math.min(ycount, rcount);
                        min = Math.min(min, bcount);
                
                        if (!ok || max - min > 1) {
                            ok = true;
                            ycount = rcount = bcount = 0;
                            dfs(0, -1, 0, 0, 1);
                            max = Math.max(ycount, rcount);
                            max = Math.max(max, bcount);
                            min = Math.min(ycount, rcount);
                            min = Math.min(min, bcount);
                            
                            if (!ok || max - min > 1) {
                                System.out.println(-1);
                                return;
                            }
                        }
                    }
                }
            }
        }
        
        // System.out.println(ycount);
        // System.out.println(rcount);
        // System.out.println(bcount);
        
        boolean flag = false;
        int nowy = 0;
        int nowr = 0;
        int nowb = 0;
        if (ycount == rcount && bcount+1 == ycount) {
            nowy = 1;
            nowr = 2;
            nowb = 3;
        } else if (ycount == bcount && rcount+1 == ycount) {
            nowy = 1;
            nowr = 3;
            nowb = 2;
        } else if (rcount == bcount && ycount+1 == bcount) {
            nowy = 3;
            nowr = 1;
            nowb = 2;
        } else if (ycount == rcount && bcount-1 == ycount) {
            nowy = 2;
            nowr = 3;
            nowb = 1;
        } else if (ycount == bcount && rcount-1 == ycount) {
            nowy = 3;
            nowr = 1;
            nowb = 2;
        } else if (rcount == bcount && ycount-1 == bcount) {
            nowy = 1;
            nowr = 3;
            nowb = 2;
        } else {
            nowy = 1;
            nowr = 2;
            nowb = 3;
        }
        
        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                System.out.print(nowy);
                nowy += 3;
            } else if (color[i] == 1) {
                System.out.print(nowr);
                nowr += 3;
            } else {
                System.out.print(nowb);
                nowb += 3;
            }
            
            if (i < n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
    
    // 頂点pと隣接する点に自分の値+距離を配る
    public static void dfs(int p, int par, int ggcol, int gcol, int pcol) {
        if (ggcol == 0 && gcol == 1 && pcol == 2) {
            rcount++;
            color[p] = 1;
        } else if (ggcol == 1 && gcol == 2 && pcol == 1) {
            bcount++;
            color[p] = 2;
        } else if (ggcol == 2 && gcol == 1 && pcol == 2) {
            ycount++;
            color[p] = 0;
        } else if (ggcol == 1 && gcol == 2 && pcol == 0) {
            ycount++;
            color[p] = 0;
        } else if (ggcol == 2 && gcol == 0 && pcol == 0) {
            rcount++;
            color[p] = 1;
        } else if (ggcol == 0 && gcol == 0 && pcol == 1) {
            bcount++;
            color[p] = 2;
        } else {
            ok = false;
        }
        
        for (Integer q : to[p]) {
            if (q == par) continue;
            dfs(q, p, gcol, pcol, color[p]);
        }
    }
}