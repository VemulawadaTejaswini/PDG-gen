import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
            int v = mp.getOrDefault(a[i], 0);
            mp.put(a[i], v+1);
        }
      
        int sum = 0;
        for(int v : mp.values()){
            sum += v * (v-1) / 2;
        }

      for(int i = 0; i < n; ++i){
            int v = mp.get(a[i]);
            int ans = sum;
            ans -= v*(v-1)/2;
            ans += (v-1)*(v-2)/2;
            System.out.println(ans);
        }
    }
}
