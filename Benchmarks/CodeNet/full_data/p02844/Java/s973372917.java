import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] sa = s.split("");
        List<String> ans = new ArrayList();
        String t = "";
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    t = sa[i] + sa[j] + sa[k];
                    if (!ans.contains(t)) {
                        ans.add(t);
                    }
                }
            }
        }

        System.out.println(ans.size());
    }
}