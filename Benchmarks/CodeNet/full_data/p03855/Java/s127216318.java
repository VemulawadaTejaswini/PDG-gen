import java.util.*;

public class Main
{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        List<Set<Integer>> road = new ArrayList<>();
        List<Set<Integer>> rail = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            road.add(new HashSet<>());
            rail.add(new HashSet<>());
        }
        for (int i = 0; i < k; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            s--;
            t--;
            road.get(s).add(t);
            road.get(t).add(s);
        }
        for (int i = 0; i < l; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            s--;
            t--;
            rail.get(s).add(t);
            rail.get(t).add(s);
        }

        Map<Integer, Set<Integer>> roadCon = new HashMap<>();
        Map<Integer, Set<Integer>> railCon = new HashMap<>();

        dfs(road, roadCon, n);
        dfs(rail, railCon, n);

        for (int i = 0; i < n; i++) {
            System.out.print(intersect(roadCon.get(i), railCon.get(i)));
            System.out.print(" ");
        }

    }

    public static int intersect(Set<Integer>s1, Set<Integer>s2){
        int total = 0;
        for (int i : s1) {
            if (s2.contains(i)){
                total++;
            }
        }
        return total;
    }

    public static void dfs(List<Set<Integer>> road, Map<Integer, Set<Integer>> con, int n){
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                Stack<Integer> s = new Stack<>();
                s.push(i);
                Set<Integer> tocon = new HashSet<>();
                while (!s.empty()){
                    int t = s.pop();
                    tocon.add(t);
                    visited[t] = true;
                    for (int j : road.get(t)) {
                        if (!visited[j]){
                            s.push(j);
                        }
                    }
                }
                for (int j : tocon) {
                    con.put(j, tocon);
                }
            }
        }
    }

}