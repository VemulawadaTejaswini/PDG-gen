import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            h.merge(a, 1, Integer::sum);
        }
        sc.close();
        List<Integer> s = new ArrayList<>(h.values());
        Collections.sort(s);
        int ans = 0;
        for (int i = s.size() - k - 1; i >= 0; i--) {
            ans += s.get(i);
        }
        System.out.println(ans);
    }
}