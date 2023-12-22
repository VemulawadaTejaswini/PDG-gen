
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        int N = scan.nextInt();
        for(int i = 0; i < N; i++) {
            int A = scan.nextInt();
            HashMap<Integer, Integer> subMap = new HashMap<>();
            for(int j = 0; j < A; j++) {
                int x = scan.nextInt() - 1;
                int y = scan.nextInt();
                subMap.put(x,y);
            }
            map.put(i, subMap);
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            int depth = dfs(map, i, N);
            if(depth != -1 && ans < depth)
                ans = depth;
        }
        os.println(ans);
    }


    public static int dfs(HashMap<Integer, HashMap<Integer, Integer>> map, int start, int size) {
        int defined[] = new int[size];
        ArrayList<Integer> visited = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            defined[i] = 2;
        }

        int depth = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(start);

        while(q.size() != 0) {
            int tmp = q.poll();
            HashMap<Integer, Integer> subMap = map.get(tmp);
            for(Entry<Integer, Integer> entry : subMap.entrySet()) {
                if(defined[entry.getKey()] == 2) {
                    defined[entry.getKey()] = entry.getValue();
                    if(entry.getValue() == 1 && !visited.contains(entry.getKey())) {
                        q.offer(entry.getKey());
                    }
                }
                else if(defined[entry.getKey()] != entry.getValue()) {
                    return -1;
                }
            }
            visited.add(tmp);
            depth++;
        }

        return depth;
    }


}