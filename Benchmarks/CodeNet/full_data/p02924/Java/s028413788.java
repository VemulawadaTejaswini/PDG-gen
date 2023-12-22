import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> lst = new ArrayList<>();
        for (Long i = 0L; i < n; i++){
            lst.add (i + 1L);
        }
        Long ans = 0L;
        Long max = 0L;
        lst.sort(Comparator.reverseOrder());
        Iterator<Long> it = lst.iterator();
        while(it.hasNext()) {
            Long l = it.next();
            if (l == 1L) continue;
            Long w = l - 1L;
            ans += w % l;
        }
        System.out.println(ans);
    }
}
