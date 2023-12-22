import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    private static HashMap<Integer, HashMap<Integer,Integer>> map1;
    private static boolean[] visited;
    private static boolean[] white;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int u,v,w;
        map1 = new HashMap<>();
        for(int i = 0; i < n-1; i++){
            u = Integer.parseInt(sc.next());
            v = Integer.parseInt(sc.next());
            w = Integer.parseInt(sc.next());
            if(map1.containsKey(u)){
                map1.get(u).put(v, w);
            }else{
                HashMap<Integer,Integer> map2 = new HashMap<>();
                map2.put(v, w);
                map1.put(u, map2);
            }
            if(map1.containsKey(v)){
                map1.get(v).put(u, w);
            }else{
                HashMap<Integer,Integer> map2 = new HashMap<>();
                map2.put(u, w);
                map1.put(v, map2);
            }
        }
        
        visited = new boolean[n+1];
        white = new boolean[n+1];
        if(!map1.isEmpty()){
            dfs(1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(white[i]){
                sb.append("0").append(System.lineSeparator());
            }else{
                sb.append("1").append(System.lineSeparator());
            }
        }
        System.out.print(sb);
    }
    
    private static void dfs(int v){
        
        visited[v] = true;
        
        for(Integer i : map1.get(v).keySet()){
            if(!visited[i]){
                if(map1.get(v).get(i) % 2 == 0){
                    white[i] = white[v];
                }else{
                    white[i] = !white[v];
                }
                dfs(i);
            }
        }
    }
}