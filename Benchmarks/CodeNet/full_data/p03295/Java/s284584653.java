import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
 
        List<Set<Integer>> setList = new ArrayList<>();
 
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Set<Integer> thisSet = IntStream.range(a, b).mapToObj(x -> x).collect(Collectors.toCollection(HashSet::new));
 
            if (setList.isEmpty()) {
                setList.add(thisSet);
            } else {
                boolean segregate = true;
                for (Set<Integer> set : new ArrayList<>(setList)) {
                    Set<Integer> intersection = new HashSet<>(thisSet);
                    intersection.retainAll(set);
                    if (!intersection.isEmpty()) {
                        segregate = false;
                        setList.remove(set);
                        setList.add(intersection);
                    }
                }
                if (segregate) {
                    setList.add(thisSet);
                }
            }
        }
        System.out.println(setList.size());
    }
}