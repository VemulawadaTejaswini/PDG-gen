import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Limit> limitList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            limitList.add(new Limit(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(limitList, Comparator.comparingInt(limit -> limit.upper));

        int numDestroyedBridges = 0;
        int lastDestroyedBridge = 0;
        for (Limit l : limitList) {
            if (l.lower > lastDestroyedBridge) {
                lastDestroyedBridge = l.upper - 1;
                numDestroyedBridges++;
                System.out.println("lastDestroyedBridge" + lastDestroyedBridge);
            }
        }
        System.out.println(numDestroyedBridges);
    }
}

class Limit {
    int lower;
    int upper;
    Limit(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public String toString() {
        return "(" + lower + ", " + upper + ")";
    }
}