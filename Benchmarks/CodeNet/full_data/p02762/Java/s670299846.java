import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        List<Set<Integer>> friends = new ArrayList<>();
        List<Set<Integer>> blocks = new ArrayList<>();

        for (int i = 0 ; i <= n ; i++){
            friends.add(new HashSet<>());
            blocks.add(new HashSet<>());
        }

        for (int i = 0 ; i < m ; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            friends.get(a).add(b);
            friends.get(b).add(a);
        }

        for (int i = 0 ; i < k ; i++){
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            blocks.get(c).add(d);
            blocks.get(d).add(c);
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(calcFriendsCandidates(i + 1, friends, blocks));
            System.out.print(" ");
        }
        System.out.println();

    }

    private static int calcFriendsCandidates(int a, List<Set<Integer>> friends, List<Set<Integer>> blocks) {
        Set<Integer> friend = (HashSet)((HashSet)friends.get(a)).clone();
        Set<Integer> block = (HashSet)((HashSet)blocks.get(a)).clone();

        Set<Integer> candidates = new HashSet<>();
        for(Integer i : friend){
            candidates.addAll((HashSet)((HashSet)friends.get(i)).clone());
        }
        candidates.removeAll(block);
        candidates.removeAll(friend);
        candidates.remove(a);

        return candidates.size();
    }


}
