import java.util.*;

public class Main{
    static int N;
    static List<List<Integer>> friend;
    static List<List<Integer>> block;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        friend = new ArrayList<>();
        block = new ArrayList<>();
        for(int i=0; i<M; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            friend.add(new ArrayList<>(Arrays.asList(A,B)));
        }
        for(int i=0; i<K; i++){
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            block.add(new ArrayList<>(Arrays.asList(C,D)));
        }

        for(int i=0; i<N; i++){
            Set<Integer> candidates = new HashSet<>();
            for(int j=0; j<N; j++){
                extend(i,j, candidates);
            }
            System.out.println(candidates.size());
        }
    }
    public static void extend(int fr,int to, Set<Integer> curset){
        for(List<Integer> fre:friend){
            if(fre.get(0) == to && fre.get(1) != fr){
                curset.add(fre.get(1));
                extend(fr, fre.get(1), curset);
            }else if(fre.get(1) == to && fre.get(0) != fr){
                curset.add(fre.get(0));
                extend(fr, fre.get(0), curset);
            }
        }
    }
}