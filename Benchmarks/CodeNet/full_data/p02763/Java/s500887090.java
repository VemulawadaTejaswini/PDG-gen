import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = 1;
    int[][] data;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        int n0 = sc.nextInt();
        while(n<n0) n*=2;
        data = new int[26][2*n-1];
        char[] s = sc.next().toCharArray();
        for(int i=0;i<n0;i++){
            int cur = s[i]-'a';
            update(i,1,data[cur]);
        }
        int q = sc.nextInt();
        while(q-->0){
            int type = sc.nextInt();
            if(type==1){
                int i = sc.nextInt()-1;
                char c = sc.next().charAt(0);
                if(s[i] == c) continue;
                update(i,0,data[s[i]-'a']);
                update(i,1,data[c-'a']);
                s[i] = c;
            } else{
                int cnt = 0,left = sc.nextInt()-1, right = sc.nextInt()-1;
                for(int i=0;i<26;i++){
                    int cur = rangeSum(0,left,right,0,n-1,data[i]);
                    if(cur>0) cnt += 1;
                }
                out.println(cnt);

            }
        }
        out.flush();
    }
    void update(int k, int val, int[] seg){
        k += n-1;
        seg[k] = val;
        while(k>0){
            k = (k-1)/2;
            seg[k] = seg[2*k+1]+seg[2*k+2];
        }
    }
    int rangeSum(int k, int qstart, int qend, int nstart, int nend, int[] seg){
        if(nend<qstart||qend<nstart) return 0;
        if(qstart<=nstart&&nend<=qend) return seg[k];
        int mid = (nstart+nend)/2;
        int left = rangeSum(2*k+1,qstart,qend,nstart,mid,seg);
        int right = rangeSum(2*k+2,qstart,qend,mid+1,nend,seg);
        return left+right;
    }
}

