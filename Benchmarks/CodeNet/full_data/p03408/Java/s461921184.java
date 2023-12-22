import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        int n = in.nextInt(); in.nextLine();
        List<String> s = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            s.add(in.nextLine());
        }
        int m = in.nextInt(); in.nextLine();
        List<String> t = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            t.add(in.nextLine());
        }
        Map<String, List<String>> sMap = s.stream().collect(Collectors.groupingBy(String::toString));
        Map<String, List<String>> tMap = t.stream().collect(Collectors.groupingBy(String::toString));
        OptionalInt ans = sMap.keySet().stream()
                .mapToInt(str -> sMap.get(str).size() - (tMap.containsKey(str) ? tMap.get(str).size() : 0))
                .max();
        System.out.println(Math.max(0, ans.getAsInt()));
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
