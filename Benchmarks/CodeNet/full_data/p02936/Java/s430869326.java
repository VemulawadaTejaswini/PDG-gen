import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        Map<Integer, List<Integer>> adja = new HashMap<>();
        for(int i=1; i<=N; i++){
            adja.put(i, new ArrayList<>());
        }
        for(int i=0; i<N-1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adja.get(a).add(b);
        }
        Map<Integer, Integer> oper = new HashMap<>();
        for(int i=0; i<Q; i++){
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            if(!oper.containsKey(p)){
                oper.put(p,0);
            }
            oper.put(p, oper.get(p) + x);
        }

        Map<Integer, Integer> counter = new HashMap<>();
        for(Integer node:adja.keySet()){
            counter.put(node, 0);
        }
        // System.out.println(adja);
        // System.out.println(oper);
        for(Integer key: oper.keySet()){
            int val = oper.get(key);
            LinkedList<Integer> nodes = new LinkedList<>();
            nodes.add(key);
            while(nodes.size()>0){
                int node = nodes.poll();
                counter.put(node, counter.get(node) + val);
                for(Integer nextnode : adja.get(node)){
                    nodes.add(nextnode);
                }
            }
        }

        for(int i=1; i<=N; i++){
            System.out.println(counter.get(i));
        }
    }
}