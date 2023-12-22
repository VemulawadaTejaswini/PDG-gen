import java.util.*;

public class Main {
    static final long MOD = 998244353;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] D = new int[N];
        TreeMap<Integer, Node> mp = new TreeMap<>();
        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
            D[i] = sc.nextInt();
            mp.put(X[i], new Node(X[i]+D[i]));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer x : mp.descendingKeySet()){
            Node now = mp.get(x);
            while(!pq.isEmpty()){
                if(pq.peek() >= now.pos){
                    break;
                }else{
                    now.children.add(mp.get(pq.poll()));
                }
            }
            pq.add(x);
        }
        long ans = 1;
        while(!pq.isEmpty()){
            int target = pq.poll();
//            System.out.println(mp.get(target));
            ans *= mp.get(target).cnt();
            ans %= MOD;
        }
        System.out.println(ans);
    }

    private static class Node{
        public List<Node> children = new ArrayList<>();
        public int pos;
        Node(int p){
            pos = p;
        }

        long cnt(){
            if(children.size() == 0){
                return 2;
            }
            long ans = 1;
            for(Node c:children){
                ans *= c.cnt();
                ans %= MOD;
            }
            ans ++;
            ans %= MOD;
            return ans;
        }
        @Override
        public String toString(){
            return pos + children.toString();
        }
    }
}
