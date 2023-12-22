import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++) {
            int l = in.nextInt();
            if(map.containsKey(l)) {
                map.put(l, map.get(l)+1);
            }
            else {
                map.put(l, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        int len = keySet.size();
        Integer[] keysObj = keySet.toArray(new Integer[0]);
        int[] keys = new int[len];
        for(int i=0; i<len; i++) {
            keys[i] = keysObj[i];
        }

        int[][] c_count = new int[len][len]; // int[from][to]
        for(int i=0; i<len; i++) {
            c_count[i][i] = map.get(keys[i]);
            for(int j=i+1; j<len; j++) {
                c_count[i][j] = c_count[i][j-1] + map.get(keys[j]);
            }
        }

        long count = 0;
        for(int i=0; i<len; i++) {
            int a = keys[i];
            int a_count = map.get(a);
            for(int j=(a_count>1?i:i+1); j<len; j++) {
                int b = keys[j];
                int b_count = map.get(b);
                count += combination(b_count, (a==b)?3:2);

                // search the max c
                if(j+1<len) {
                    int max_c_value = a+b-1;
                    int max_c_index = findMaxCIndex(keys, max_c_value);
                    if(j+1<=max_c_index) {
                        count += c_count[j+1][max_c_index];
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static long combination(int left, int right) {
        if(left < right) {
            return 0;
        }
        long r = left;
        for(int i=1; i<right; i++) {
            r *= left - i;
        }
        for(int i=1; i<=right; i++) {
            r /= i;
        }
        return r;
    }
    private static int findMaxCIndex(int[] keys, int max_c_value) {
        if(keys[0] > max_c_value) {
            return -1;
        }
        int l=0;
        int r=keys.length-1;
        int k=0;
        while(l<r) {
            if(l+1==r) {
                k = l;
                if(keys[r]<=max_c_value) {
                    k = r;
                }
                break;
            }
            k=(l+r)/2;
            if(keys[k]<=max_c_value) {
                l = k;
            }
            else {
                r = k;
            }
        }
        return k;
    }
}
