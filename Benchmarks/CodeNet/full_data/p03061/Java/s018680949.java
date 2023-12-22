import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int[] as = new int[a.length];
        
        for (int i = 0; i < as.length; i++) {
            as[i] = Integer.parseInt(a[i]);
        }
        
        //int[] d = new int[1000000005];
        //List<Integer> d = new ArrayList();
        
        Map<Integer, Integer> d = new HashMap();
        for (int i = 0; i < as.length; i++) {
            for (int j = 1; j < Math.sqrt(as[i]); j++) {
                if (as[i] % j == 0) {
                    if (d.get(j) != null) {
                        d.put(j, d.get(j)+1);
                    }
                    else d.put(j, 1);
                    if (d.get(as[i]/j) != null) {
                        d.put(as[i]/j, d.get(as[i]/j)+1);
                    }
                    else d.put(as[i]/j, 1);
                }
            }
        }
        
        int max = 1;
        for (Integer key : d.keySet()) {
            if (d.get(key) >= n-1) {
                if (key > max) {
                    max = key;
                }
            }
        }
        
        /*List<Integer> cand = new ArrayList();
        cand.add(1);
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= n-1) {
                cand.add(i);
            }
        }
        
        Collections.sort(cand);*/
        
        System.out.println(max);
        //System.out.println(cand.get(2));
    }
}



