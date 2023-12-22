import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static Map<Integer, List<Integer>> fuelMap = new HashMap<>();
    static int[][] kyuyu;
    static int[][] dist;
    static int L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int M = sc.nextInt();
        L = sc.nextInt();
        kyuyu = new int[N][N];
        dist = new int[N][N];
        for(int i=0;i<N;i++){
            Arrays.fill(kyuyu[i], -1);
            Arrays.fill(dist[i], -1);
        }
        for(int i=0;i<M;i++){
            int A=sc.nextInt()-1;
            int B=sc.nextInt()-1;
            int C=sc.nextInt();
            if(C <= L){
                kyuyu[A][B]=0;
                kyuyu[B][A]=0;
                dist[A][B]=C;
                dist[B][A]=C;
                map.computeIfAbsent(A, z->new ArrayList<>());
                map.get(A).add(B);
                map.computeIfAbsent(B, z->new ArrayList<>());
                map.get(B).add(A);
            }else{
                kyuyu[A][B]=Integer.MAX_VALUE;
                kyuyu[B][A]=Integer.MAX_VALUE;
                dist[A][B]=Integer.MAX_VALUE;
                dist[B][A]=Integer.MAX_VALUE;
            }
        }
        //System.out.println(map);
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                //iからjまで無給油で行けるかどうかを判定し、結果をkyuyuに書き込む。
                if(kyuyu[i][j] == 0){
                    fuelMap.computeIfAbsent(i, z->new ArrayList<>());
                    fuelMap.get(i).add(j);
                    fuelMap.computeIfAbsent(j, z->new ArrayList<>());
                    fuelMap.get(j).add(i);
                    continue;
                }
                if(checkIfMukyuyu(i,j)){
                    kyuyu[i][j] = 0;
                    fuelMap.computeIfAbsent(i, z->new ArrayList<>());
                    fuelMap.get(i).add(j);
                    fuelMap.computeIfAbsent(j, z->new ArrayList<>());
                    fuelMap.get(j).add(i);
                }
            }
        }
        //System.out.println(fuelMap);
        int Q = sc.nextInt();
        for(int q=0;q<Q;q++){
            int s=sc.nextInt()-1;
            int t=sc.nextInt()-1;
            if(kyuyu[s][t] != Integer.MAX_VALUE && kyuyu[s][t] != -1){
                System.out.println(kyuyu[s][t]);
            }else {
                System.out.println(kyuyuCnt(s, t));
            }
        }
    }

    public static int kyuyuCnt(int s, int e){
        PriorityQueue<Car> pq = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.pastDist - o2.pastDist;
            }
        });
        Set<Integer> visited = new HashSet<>();
        visited.add(s);
        pq.add(new Car(s, -1, visited));
        while(!pq.isEmpty()){
            Car now=pq.poll();
            if(now.now == e){
                return now.pastDist;
            }
            List<Integer> neighbor = fuelMap.get(now.now);
            if(neighbor == null || neighbor.isEmpty()){
                continue;
            }
            for(Integer next:neighbor){
                if(now.now != next && !now.visited.contains(next)) {
                    if(kyuyu[s][next] != -1) {
                        kyuyu[s][next] = Math.min(now.pastDist + 1, kyuyu[s][next]);
                        kyuyu[next][s] = Math.min(now.pastDist + 1, kyuyu[s][next]);
                    }
                    Set<Integer> newVisited = new HashSet<>();
                    newVisited.addAll(now.visited);
                    newVisited.add(now.now);
                    pq.add(new Car(next, now.pastDist + 1, newVisited));
                }
            }
        }
        return -1;
    }

    public static class Car{
        int now;
        int pastDist;
        Set<Integer> visited = new HashSet<>();
        Car(int n, int pd, Set<Integer> v){
            now = n;
            pastDist = pd;
            visited = v;
        }
    }

    public static boolean checkIfMukyuyu(int s, int e){//V - 残り
        PriorityQueue<State> pq = new PriorityQueue<>(new Comparator<State>() {
            @Override
            public int compare(State o1, State o2) {
                return o2.fuel-o1.fuel;
            }
        });
        Set<Integer> visited = new HashSet<>();
        visited.add(s);
        pq.add(new State(L, s, visited));
        while(!pq.isEmpty()){
            State ns = pq.poll();
            if(ns.now == e){
                return true;
            }
            List<Integer> neighbor = map.get(ns.now);
            if(neighbor == null || neighbor.isEmpty()){
                continue;
            }
            for(Integer next:neighbor){
                if(!ns.visited.contains(next)){
                    int newFuel = ns.fuel - dist[ns.now][next];
                    if(newFuel >= 0) {
                        Set<Integer> newVisited = new HashSet<>();
                        newVisited.addAll(ns.visited);
                        newVisited.add(ns.now);
                        pq.add(new State(newFuel, next, newVisited));
                    }
                }
            }
        }
        return false;
    }

    public static class State{
        int fuel;
        int now;
        Set<Integer> visited;
        State(int f,int n, Set<Integer> v){
            fuel = f;
            now = n;
            visited = v;
        }
    }

}
