import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            Integer v = map.get(a[i]);
            if (v == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], ++v);
            }
        }

        long sum = 0;

        HashMap<Integer, Integer> result = new HashMap<>();

        for (Integer key: map.keySet()
        ) {
            int t = map.get(key);
            if (t < 2) {
                result.put(key, 0);
                continue;
            }
            int v = nCk(t, 2, 1000000007);
            result.put(key, v);
            sum += v;
        }

        for (int i = 0; i < n; i++) {
            int v = map.get(a[i]);
            if (v == 1) {
                System.out.println(sum);
            } else {
                if (v == 2) {
                    System.out.println(sum - 1);
                } else {
                    int t = nCk(v - 1, 2, 1000000007);
                    System.out.println(sum - result.get(a[i]) + t);
                }
            }
        }
    }

    //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}