import java.util.*;

public class Main {

    static int DAT_SIZE = (1<<24)-1;

    static long[] data = new long[DAT_SIZE];
    static long[] datb = new long[DAT_SIZE];

    static void add(int a, int b, long x, int k, int l, int r) {
        if (a<=l && r<=b) {
            data[k] += x;
        } else if (l<b && a<r) {
            datb[k] += (Math.min(b, r) - Math.max(a, l))*x;
            add(a, b, x, k*2+1, l, (l+r)/2);
            add(a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    static long sum(int a, int b, int k, int l, int r) {
        if (b<=l || r<=a) {
            return 0;
        } else if (a<=l && r<=b) {
            return data[k]*(r-l)+datb[k];
        } else {
            long res = (Math.min(b, r) - Math.max(a, l)) * data[k];
            res += sum(a, b, k*2+1, l, (l+r)/2);
            res += sum(a, b, k*2+2, (l+r)/2, r);
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        Long[] X = new Long[N];
        ArrayList<Long[]> list = new ArrayList<Long[]>();
        for (int i=0;i<N;i++) {
            X[i] = Long.parseLong(sc.next());
            long H = Integer.parseInt(sc.next());
            Long[] add = {X[i], (H+A-1)/A};
            list.add(add);
        }
        Collections.sort(list, (o1, o2)->Long.compare(o1[0], o2[0]));
        for (int i=0;i<N;i++) {
            add(i, i+1, list.get(i)[1], 0, 0, N);
        }
        Arrays.sort(X);
        int[] index = new int[N];
        long ans = 0;
        Comparator<Long[]> comparator = new Comparator<Long[]>() {
            @Override
            public int compare(Long[] o1, Long[] o2) {
                if (o1[0]>=o2[0]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        for (int i=0;i<N;i++) {
            // index[i] = ~Arrays.binarySearch(X, X[i]+2*D+1, (o1, o2)->o1>=o2?1:-1);
            // index[i] = ~Collections.binarySearch(list, list.get(i)[0]+2*D+1, (o1, o2)->o1[0]>=o2[0]?1:-1);
            Long[] obj = {list.get(i)[0]+2*D+1, 0L};
            index[i] = ~Collections.binarySearch(list, obj, comparator);
            long cnt = sum(i, i+1, 0, 0, N);
            if (cnt<=0) continue;
            add(i, index[i], -cnt, 0, 0, N);
            ans += cnt;
        }
        System.out.println(ans);
    }
}