import java.io.*;
import java.util.*;
public class Main {
    static int dfs(ArrayList<Integer>[] gh, int curv, HashMap<Integer, Integer> map, HashSet<Integer> visited) {
        if(gh[curv] == null)
            return 0;
        if(map.containsKey(curv)) 
            return map.get(curv);
        visited.add(curv);
        int maxd = 0;
        for(int v2 : gh[curv]) {
            maxd = Math.max(dfs(gh, v2, map, visited), maxd);
        }
        maxd++;
        map.put(curv, maxd);
        return maxd;
    }
    
    public static void main(String args[]) {
        int n = 0, m = 0;
        ArrayList<Integer>[] gh = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            
            gh = new ArrayList[n + 1];
            for(int i = 0; i< m; i++){
                int v1 = scanner.nextInt();
                int v2 = scanner.nextInt();
                if(gh[v1] == null)
                    gh[v1] = new ArrayList();
                gh[v1].add(v2);
            }
            
        }
        
        HashSet<Integer> visited = new HashSet();
        HashMap<Integer, Integer> map = new HashMap();
        int max = 0;
        for(int i = 1; i <= n; i++) {
            if(gh[i] != null && !visited.contains(i))
                max = Math.max(max, dfs(gh, i, map, visited));
        }
        
        System.out.println(max);
        
    }
}