import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> candidate = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            candidate.add(i);
        }
        scan.nextLine();
        String p = scan.nextLine();
        String q = scan.nextLine();
        List<List<Integer>> list = make(candidate);
        List<String> strings = new ArrayList();
        for (List<Integer> x : list) {
            strings.add(x.stream().map(i -> i.toString()).collect(Collectors.joining(" ")));
        }
        int len = strings.size();
        int l = 0;
        int r = 0;
        for (int i = 0; i < len; i++) {
            if (p.equals(strings.get(i))) {
                l = i;
            }
            if (q.equals(strings.get(i))) {
                r = i;
            }
        }
        System.out.println(Math.abs(l - r));
    }

    public static List<List<Integer>> make(List<Integer> candidate) {
        if (candidate.size() == 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }

        return candidate.stream().flatMap(i -> {
            List<Integer> rest = new ArrayList<>(candidate);
            rest.remove(i);
            return make(rest).stream().map(list -> {
                list.add(0, i);
                return list;
            });
        }).collect(Collectors.toList());
    }
}
