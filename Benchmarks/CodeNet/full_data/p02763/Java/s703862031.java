import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        
        SegmentTree[] st = new SegmentTree[26];
        for(int i = 0; i < 26; i++){
            st[i] = new SegmentTree(n+1);
        }
        for(int i = 1; i <= n; i++){
            st[s[i-1] - 'a'].update(i, 1);
        }
        
        int q = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            if(Integer.parseInt(sc.next()) == 1){
                int iq = Integer.parseInt(sc.next());
                char cq = sc.next().charAt(0);
                st[s[iq-1] - 'a'].update(iq, 0);
                st[cq - 'a'].update(iq, 1);
                s[iq-1] = cq;
            }else{
                int lq = Integer.parseInt(sc.next());
                int rq = Integer.parseInt(sc.next());
                int ans = 0;
                for(int j = 0; j < 26; j++){
                    int k = st[j].getSum(lq, rq+1);
                    if(k > 0) ans++;
                }
                sb.append(ans).append(System.lineSeparator());
            }
        }
        System.out.print(sb);
    }
    
    static class SegmentTree {
        int n;
        int[] node;

        public SegmentTree(int size) {
            n = 1;
            while(n < size) n <<= 1;
            node = new int[2*n-1];
            Arrays.fill(node, 0);
        }
        public SegmentTree(int[] a) {
            n = 1;
            while(n < a.length) n <<= 1;
            node = new int[2*n-1];
            System.arraycopy(a, 0, node, n-1, a.length);
            Arrays.fill(node, n-1+a.length, 2*n-1, 0);
            for(int i = n-2; i >= 0; i--){
                node[i] = node[i*2+1] + node[i*2+2];
            }
        }
        void update(int i, int x){
            i += n-1;
            node[i] = x;
            while(i > 0){
                i = (i-1)/2;
                node[i] = node[i*2+1] + node[i*2+2];
            }
        }
        void add(int i, int x){
            i += n-1;
            node[i] += x;
            while(i > 0){
                i = (i-1)/2;
                node[i] = node[i*2+1] + node[i*2+2];
            }
        }
        int getSum(int a, int b){
            return getSum(a, b, 0, 0, n);
        }
        int getSum(int a, int b, int k, int l, int r){
            if(r <= a || b <= l) return 0;
            if(a <= l && r <= b) return node[k];
            int vl = getSum(a, b, k*2+1, l, (l+r)/2);
            int vr = getSum(a, b, k*2+2, (l+r)/2, r);
            return vl + vr;
        }
    }
}