import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer,Integer>[] map = new HashMap[N+1];
        for(int i=0;i<=N;i++) map[i]=new HashMap<>();
        for(int i=1;i<=N-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            map[a].put(b,c);
            map[b].put(a,c);
        }
        int Q = sc.nextInt();
        int K = sc.nextInt();
        long[] dist = new long[N+1];
        Arrays.fill(dist,-1);
        dist[K]=0;
        LinkedList<Integer> current = new LinkedList<>();
        LinkedList<Integer> next = new LinkedList<>();
        current.add(K);
        while(current.size()>0){
            int now = current.poll();
            for(Integer w:map[now].keySet()){
                if(dist[w]==-1){
                    dist[w]=dist[now]+map[now].get(w);
                    next.add(w);
                }
                if(current.size()==0){
                    current=next;
                    next = new LinkedList<>();
                }
            }
        }
        for(int i=1;i<=Q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(dist[x]+dist[y]);
        }
    }
}
