import java.util.*;
public class Main {
    public static int max(int a, int b){return (a > b ? a : b);}
    public static int min(int a, int b){return (a < b ? a : b);}
    public static int gcd(int a, int b){return (b > 0 ? gcd(b, a % b) : a);}
    public static int lcm(int a, int b){return a / gcd(a, b) * b;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= N; i++)A.add(new ArrayList<Integer>());
        for(int i = 0; i <= N; i++)B.add(new ArrayList<Integer>());
        int nxt = 1;
        int[] cnt = new int[101010];
        int[] flg = new int[101010];
        for(int i = 0; i < M; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            A.get(a).add(b);
            A.get(b).add(a);
        }
        for(int i = 0; i < K; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            B.get(a).add(b);
            B.get(b).add(a);
        }
        for(int i = 1; i <= N; i++)if(flg[i] == 0){
            Queue<Integer> Q = new ArrayDeque<Integer>();
            flg[i] = nxt;
            Q.add(i);
            cnt[nxt]++;
            while(true){
                Integer idx = Q.poll();
                if(idx == null)break;
                for(int j = 0; j < A.get(idx).size(); j++){
                    int to = A.get(idx).get(j);
                    if(flg[to] != 0)continue;
                    flg[to] = nxt;
                    Q.add(to);
                    cnt[nxt]++;
                }
            }
            nxt++;
        }
        for(int i = 1; i <= N; i++){
            int ans = cnt[flg[i]] - 1 - A.get(i).size();
            for(int j = 0; j < B.get(i).size(); j++){
                int to = B.get(i).get(j);
                if(flg[i] == flg[to])ans--;
            }
            System.out.print(ans + (i == N ? "\n" : " "));
        }
    }
}
