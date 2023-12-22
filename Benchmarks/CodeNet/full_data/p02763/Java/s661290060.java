import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int q = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        SegTree st = new SegTree();
        st.init(n);

        for (int i=0; i<n; i++) {
            st.update(i, arr[i]);
        }

        for (int i=0; i<q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                int idx = sc.nextInt() - 1;
                char c = sc.next().charAt(0);
                st.update(idx, c);
            } else {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int u = 1;
                if (r - l >= 1) u = st.query(l, r).size();
                sb.append(u + "\n");
            }
        }

        System.out.println(sb.toString());
    }

    public class SegTree {

        int n = 1;
        Set<Character>[] val;

//    public SegTree(int n) {
//        while (this.n < n) this.n *= 2;
//        val = new HashSet[2*this.n-1];
//    }


        void init(int n) {
            while (this.n < n) this.n *= 2;
            val = new HashSet[2*this.n-1];
            for (int i=0; i<2*this.n-1; i++) {
                val[i] = new HashSet<>();
            }
        }


        void update(int k, char a) {
            k += n - 1;
            val[k].clear();
            val[k].add(a);
            while (k > 0) {
                k = (k - 1) / 2;
                Set<Character> tmp = new HashSet<>();
                tmp = val[2*k+1];
                tmp.addAll(val[2*k+2]);
                val[k] = tmp;
            }
        }

        Set<Character> query(int a, int b) {
//            for (int i=0; i<val.length; i++) {
//                System.out.println(val[i]);
//            }
            return query(0, n, a, b, 0);
        }

        Set<Character> query(int l, int r, int a, int b, int k) {
            if (r<=a || b<=l) return new HashSet<>();
            if (a<=l && r<=b) return val[k];
            else {
                Set<Character> vl = query(l, (l+r)/2, a, b, 2*k+1);
                Set<Character> vr = query((l+r)/2, r, a, b, 2*k+2);
                vl.addAll(vr);
                return vl;
            }
        }
    }

}
