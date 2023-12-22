// not solved by myself

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner sc = new FastScanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        Long D = sc.nextLong();

        long c_num = get_multiple_count(A,B,C);
        long d_num = get_multiple_count(A,B,D);
        long lcm_num = get_multiple_count(A,B,lcm(C,D));

        System.out.println(B - A + 1 - c_num - d_num + lcm_num);
    }

    public static <T> HashMap<T,Integer> count_item(T[] target){
        HashMap<T,Integer> hs = new HashMap<>();
        for(T t: target){
            if(hs.containsKey(t))
                hs.put(t,hs.get(t) + 1);
            else
                hs.put(t,1);
        }
        return hs;
    }

    public static class Iterations{
        // nCr を求める
        // 第1引数: 列挙対象の配列 n
        // 第2引数: r
        // 第3引数: 答えの組み合わせ配列を保持するための set
        public static <T> void combination(ArrayList<T> n, Integer r, HashSet<ArrayList<T>> ans) {
            if (n.size() == r) {
                ans.add(n);
                return;
            }

            for (int i = 0; i < n.size(); i++) {
                ArrayList<T> N = new ArrayList<>(n);
                N.remove(i);
                combination(N, r, ans);
            }
        }

        // nPr を求める
        // 第1引数: 列挙対象の配列 n
        // 第2引数: r
        // 第3引数: 答えの組み合わせ配列を保持するための set
        public static <T> List<List<T>> permutation(T[] n,int r,HashSet<ArrayList<T>> hs) {
            List<T> n_list = Arrays.asList(n);
            combination(new ArrayList<>(n_list),r,hs);

            List<List<T>> result = new ArrayList<>();
            for(ArrayList<T> tmp: hs){
                helper(0, tmp, result);
            }
            return result;
        }

        private static <T> void helper(int start, List<T> nums, List<List<T>> result) {
            if (start == nums.size() - 1) {
                ArrayList<T> list = new ArrayList<>();
                for (T num : nums) {
                    list.add(num);
                }
                result.add(list);
                return;
            }

            for (int i = start; i < nums.size(); i++) {
                swap(nums, i, start);
                helper(start + 1, nums, result);
                swap(nums, i, start);
            }
        }

        private static <T> void swap(List<T> nums, int i, int j) {
            T temp = nums.get(i);
            nums.set(i,nums.get(j));
            nums.set(j,temp);
        }
    }


    public static List<Entry<Integer,Integer>> SortMapByValue(HashMap<Integer,Integer> maps,boolean is_reverse){
        List<Entry<Integer,Integer>> entries = new ArrayList<>(maps.entrySet());

        Collections.sort(entries, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return (is_reverse ? -1 : 1) * o1.getValue().compareTo(o2.getValue());
            }
        });

        return entries;
    }

    public static long max(int[] ar,int size){
        long max = 0;
        for(int i = 0; i< size;i++)
            if(max < ar[i])
                max = ar[i];
        return max;
    }


    public static long max(List<Long> ar){
        long max = 0;
        for(int i = 0; i< ar.size();i++)
            if(max < ar.get(i))
                max = ar.get(i);
        return max;
    }

    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }

    // 最大公約数を求める
    public static <T extends Number> Long gcd(T left, T right) {
        Long m = left.longValue();
        Long n = right.longValue();
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    // 最小公倍数を求める
    public static <T extends Number> Long lcm(T left, T right){
        return left.longValue() * right.longValue() / gcd(left,right);
    }

    // A 以上、B 以下のCの倍数の個数を考える (A <= B)
    public static <T extends Number> Long get_multiple_count(T A, T B,T C){
        Long b_multi = B.longValue() / C.longValue();
        Long a_multi = (A.longValue() - 1) / C.longValue();
        return b_multi - a_multi;
    }



    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String[] nextArray(int n) {
            String[] a = new String[n];
            for (int i = 0; i < n; i++)
                a[i] = next();
            return a;
        }


        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
