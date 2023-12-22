import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer Q = Integer.parseInt(scanner.next());
        String S[] = scanner.next().split("");
        List<List<Integer>> xys = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            Integer l = Integer.parseInt(scanner.next()), r = Integer.parseInt(scanner.next());
            if(S.length < l) continue;
            if(S.length < r)  r = S.length;
            List<Integer> list = new ArrayList<>();
            list.add(l);
            list.add(r);
            xys.add(list);
        }

        for (List<Integer> xy : xys) {
            int x = xy.get(0), y = xy.get(1);
            Long count = 0L;
            for (int j = x-1; j < y-1; j++) {
                if(S[j].equals("A") && S[j+1].equals("C")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
