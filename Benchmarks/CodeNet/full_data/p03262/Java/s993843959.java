import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int start = Integer.parseInt(nx[1]);
        
        int[] cities = new int[n+1];
        int [] diffs = new int[n];
        String[] line = br.readLine().split(" ");
        
        cities[0] = start;
        for (int i = 0; i < n; i++) {
            cities[i+1] = Integer.parseInt(line[i]);
            
            
        }
        
        
        
        Arrays.sort(cities);
        
        //for (int i = 0; i < n+1; i++) System.out.println(cities[i]);
        
        for (int i = 0; i < n+1; i++) {
            if (i==0) continue;
            else {
                diffs[i-1] = cities[i] - cities[i-1];
            }
            
        }
        
        int cd = 1;
        
        if (diffs.length == 1) cd = diffs[0];
        else {
            int tmp;
            int x = diffs[0];
            int y = diffs[1];
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            cd = y;
        
            for (int i = 2; i < n; i++) {
                x = cd;
                y = diffs[i];
                while ((tmp = x % y) != 0) {
                    x = y;
                    y = tmp;
                }
                cd = y;
            }
        }
        
        System.out.println(cd);
        
        
    }
}
