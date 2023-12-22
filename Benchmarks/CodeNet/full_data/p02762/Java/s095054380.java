import java.util.*;

public class Main{
    static int N;
    static Map<Integer,Set<Integer>> friend;
    static Map<Integer, Set<Integer>> block;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        friend = new HashMap<>();
        block = new HashMap<>();
        for(int i=0; i<M; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            friend.putIfAbsent(A, new HashSet<>());
            friend.get(A).add(B);
            friend.putIfAbsent(B, new HashSet<>());
            friend.get(B).add(A);
        }
        for(int i=0; i<K; i++){
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            block.putIfAbsent(C, new HashSet<>());
            block.get(C).add(D);
            block.putIfAbsent(D, new HashSet<>());
            block.get(D).add(C);
        }

        for(int i=1; i<=N; i++){
            Set<Integer> candidates = new HashSet<>();
            candidates.add(i);
            extend(i,candidates);
            if(friend.containsKey(i)){
                candidates.removeAll(friend.get(i));
            }
            if(block.containsKey(i)){
                candidates.removeAll(block.get(i));
            }
            candidates.remove(i);
            System.out.print(candidates.size());
            System.out.print(" ");
        }
    }
    public static void extend(int fr,Set<Integer> curset){
        if(friend.containsKey(fr)){
            for(int to :friend.get(fr)){
                if(!curset.contains(to)){
                    curset.add(to);
                    // System.out.println("extend "+String.valueOf(fr)+" to "+String.valueOf(to));
                    extend(to, curset);
                }
            }
        }
    }
}