import java.util.*;
import static java.lang.System.*;

//https://atcoder.jp/contests/abc075/tasks/abc075_c
//O(n^2)の全探索。たかだかn=250
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] edges = new boolean[N][N];
        for (int m = 0; m < M; m++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a-1][b-1] = true;
            edges[b-1][a-1] = true;
        }

        solver1(N, edges);
        //solver(N, edges);
    }

    // 深さ優先探索 21:12-
    public static void solver1(int N, boolean[][] edges){
        int ans = 0;

        for(int from = 0; from < N; from++){
            for(int to = from + 1; to < N; to++){
                if(edges[from][to] == true){
                    boolean [][] copiedEdges = new boolean[N][N];
                    for(int i=0; i< N; i++) {
                        System.arraycopy(edges[i], 0, copiedEdges[i], 0, edges[i].length);
                    }
                    copiedEdges[from][to] = false;
                    copiedEdges[to][from] = false;
                    //out.println(from+" "+to);
                    if (canPassAllNodes(N, 0, copiedEdges, new boolean[N]) == false){
                        //out.println("notPassed"+from+" "+to);
                        ans++;
                    };
                }
            }
        }

        out.println(ans);
    }

    public static boolean canPassAllNodes(int N, int pos, boolean[][] edges, boolean[] passed){
        passed[pos] = true;

        boolean isPassed = true;
        for(int n = 0; n < N; n++){
            if(passed[n] == false){
                isPassed = false;
            }
        }

        if(isPassed == true){
            return true;
        }

        for(int n = 0; n < N; n++){
            if(edges[pos][n] == true && passed[n] == false){
                int next = n;
                if(canPassAllNodes(N, next, edges, passed) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void solver(int N, boolean[][] edges){
        //橋になり得る辺と接するノード
        Set<Integer> left_nodes = new HashSet<Integer>();
        for(int n = 0; n < N; n++) {
            left_nodes.add(n);
        }

        //1つの辺としか繋がっていないノードに接する辺は橋になりえる
        //橋になり得る辺を除いて、再度チェックする(まとめて非連結になる可能性があるため)
        int ans = 0;
        int before_ans = ans + 1;
        while (ans != before_ans) {
            before_ans = ans;
            HashMap<Integer, Integer>  bridgeable_nodes = new HashMap<Integer, Integer>(); //孤立する可能性があるノード

            for(Integer from: left_nodes) {
                ArrayList<Integer> bridge_nodes = new ArrayList<Integer>();  //nとつながるノード
                for(int to=0; to<N; to++){
                    if(edges[from][to] == true){ bridge_nodes.add(to); }
                }

                //1つの辺として繋がっていないノード
                if (bridge_nodes.size() == 1){
                    bridgeable_nodes.put(from, bridge_nodes.get(0));
                }
            }

            //孤立するノードを外して再度検出処理をする
            for(Integer from: bridgeable_nodes.keySet()) {
                int to = bridgeable_nodes.get(from);
                left_nodes.remove(from);

                //一緒に孤立する場合には、1つのノードしか数えない。例えば、1<->2しかない場合。1も2も孤立するが、橋は１つ
                if(edges[from][to] == false){
                    continue;
                }

                edges[from][to] = false; //このノードと繋がっていることは忘れる。まとめて孤立する可能性がある
                edges[to][from] = false;

                ans++;
            }
        }

        out.println(ans);
    }
}