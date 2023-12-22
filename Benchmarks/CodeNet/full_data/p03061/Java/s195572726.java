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
        
        int[] d = new int[1000000005];
        //List<Integer> d = new ArrayList();
        
        for (int i = 0; i < as.length; i++) {
            for (int j = 1; j < Math.sqrt(as[i]); j++) {
                if (as[i] % j == 0) {
                    d[j]++;
                    d[as[i]/j]++;
                }
            }
        }
        
        List<Integer> cand = new ArrayList();
        cand.add(1);
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= n-1) {
                cand.add(i);
            }
        }
        
        Collections.sort(cand);
        
        System.out.println(cand.get(cand.size()-1));
        //System.out.println(cand.get(2));
    }
}



