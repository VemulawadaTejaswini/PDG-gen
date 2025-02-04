import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(array[i] - (i+1));
        }

        Collections.sort(list);

        int b=list.get(list.size()/2);
        double ans = Math.pow(10, 9);
        double x = 0;
//        for(double b=-100; b<100; b++){
            double sum=0;
            for(int j=0; j<n; j++){
                sum += Math.abs(array[j] - (b+j+1));
            }
            if(sum < ans){
                x=b;
                ans = sum;
            }
//        }

//        System.out.println(x);
        System.out.println((int)ans);



//        System.out.println("aaa");
//        System.out.println(list.get(list.size()/2));
//
//        System.out.println(x);
//        System.out.println((int)ans);
    }

//    void dfs(int from, List<Integer> list, boolean[] reachedNodes){
////        System.out.println(eachCount);
//        int eachCount = 0;
//        for(boolean b: reachedNodes){
//            if(b){
//                eachCount++;
//            }
//        }
//        if(eachCount == N){
//            count++;
//            return;
//        }
////
//        for(int i: list){
//            if(reachedNodes[i]){
//                continue;
//            }
//            reachedNodes[i] = true;
////            System.out.println(String.format("%s %s", from+1, i+1));
//            dfs(i, map.get(i), reachedNodes);
//            reachedNodes[i] = false;
//        }
//    }

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


//class Gcd {
//    public static int gcd(int a, int b){
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//
//    public static int lcm(int a, int b){
//        return a * b / gcd(a, b);
//    }
//}