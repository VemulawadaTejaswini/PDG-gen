import java.io.*;
import java.util.*;
public class Main {
    static void dfs(double[] p, int c, int mjr, int s, int h, int t, double sc, HashSet<String> visited) {
        if(s >= c && h >= mjr) {
            ret += sc;
            return;
        }
        
        String key = s + "," + h + "," + t;
        // if(visited.contains(key))
        //     return;
        
        visited.add(key);
        
        double ret = 1.0;
        double hp = p[s];
        double tp = 1.0 - hp;
        
        dfs(p, c, mjr, s + 1, h + 1, t, sc * hp, visited);
        
        if(t + 1 < mjr) {
            dfs(p, c, mjr, s + 1, h, t + 1, sc * tp, visited);
        }
    }
    
    static double ret = 0.0;
    public static void main(String args[]) {
        int c = 0;
        double[] p = null;
        try (Scanner scanner = new Scanner(System.in)) {
            c = scanner.nextInt();
            
            p = new double[c];
            for(int i = 0; i < c; i++) {
                p[i] = scanner.nextDouble();
            }
            
        }
        
        dfs(p, c, (c/2)+1, 0, 0, 0, 1.0, new HashSet());
        
        System.out.println(ret);
        
        
    }
}