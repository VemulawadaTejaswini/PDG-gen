import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> S = new LinkedList(Arrays.asList(sc.next().split("")));
        String pre = "";
        int i = 0;
        int r = 0;
        while (true) {
            if (i == 0) {
                pre = S.get(i);
            } else if (!pre.equals(S.get(i))) {
                S.remove(i);
                S.remove(i - 1);
                i = 0;
                pre = "0";
                r += 2;
            }
            if (i == S.size() - 1 || S.size() == 0) break;
            i++;
        }
        System.out.println(r);
    }
}