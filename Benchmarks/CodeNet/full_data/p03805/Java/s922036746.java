import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int N;
    int count = 0;
    Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<M; i++){
            List<Integer> list = new ArrayList<>();
            int x = sc.nextInt() -1;
            int y = sc.nextInt() -1;
            list.add(x);
            list.add(y);
            if(map.get(x) == null){
                List<Integer> a = new ArrayList<>();
                a.add(y);
                map.put(x, a);
            } else {
                List<Integer> a = map.get(x);
                a.add(y);
                map.put(x, a);
            }

            if(map.get(y) == null){
                List<Integer> a = new ArrayList<>();
                a.add(x);
                map.put(y, a);
            } else {
                List<Integer> a = map.get(y);
                a.add(x);
                map.put(y, a);
            }
        }

        for(Integer i: map.get(0)){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            boolean[] reachedNodes = new boolean[N];
            reachedNodes[0] = true;
            dfs(0, list, reachedNodes);
        }

        System.out.println(count);
    }

    void dfs(int from, List<Integer> list, boolean[] reachedNodes){
//        System.out.println(eachCount);
        int eachCount = 0;
        for(boolean b: reachedNodes){
            if(b){
                eachCount++;
            }
        }
        if(eachCount == N){
            count++;
            return;
        }
//
        for(int i: list){
            if(reachedNodes[i]){
                continue;
            }
            reachedNodes[i] = true;
//            System.out.println(String.format("%s %s", from+1, i+1));
            dfs(i, map.get(i), reachedNodes);
            reachedNodes[i] = false;
        }
    }

//    void dfs(int from, List<Integer> toList, boolean[] eachReachedNode, boolean[][] threwEdge, boolean countedFlug) {
//
//        reachedNode[from] = true;
//        eachReachedNode[from] = true;
//
//        for (int i : toList) {
//            if ((threwEdge[from][i] || threwEdge[i][from])) {
//                continue;
//            } else if(eachReachedNode[i] && !countedFlug){
////                System.out.println(String.format("%s %s", from , i));
//                count++;
//                countedFlug = true;
//                threwEdge[from][i] = true;
//                threwEdge[i][from] = true;
////                return;
//            } else {
//                if(map.get(i) == null){
//                    return;
//                } else {
//                    threwEdge[from][i] = true;
//                    threwEdge[i][from] = true;
//                    dfs(i, map.get(i), eachReachedNode, threwEdge, countedFlug);
//                }
//            }
//        }
//    }
//    void dfs(int from, int to) {
//
//        if (from > 100 || to > 100 || reachedArray[from][to]) {
//            return;
//        }
//
//        reachedArray[from][to] = true;
//
//        if (hasArray[from][to]) {
//            count++;
//        }
//        dfs(to, to + 1);
//        dfs(to + 1, to);
//    }
}
