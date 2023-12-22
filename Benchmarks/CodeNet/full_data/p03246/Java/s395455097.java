
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = new int[n/2];
        int[] s = new int[n/2];
        int j = 0;
        int k = 0;
        for (int i = 0;  i < n; i++) {
            if (i%2 == 0) {
                f[j++] = sc.nextInt();
            } else {
                s[k++] = sc.nextInt();
            }
        }

        int evenMax = (int)(keisan(f).keySet().toArray())[0];
        int oddMax = (int)(keisan(s).keySet().toArray())[0];
        
        int rel = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] != evenMax) {
                rel++;
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] != oddMax) {
                rel++;
            }
        }
        System.out.println(rel);
        sc.close();
    }

    static Map<Integer, Integer> keisan (int[]arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put((Integer)arr[i], (map.get(arr[i]) == null ? 0 : map.get(arr[i]))+1);
        }
     return map;
    }
}
