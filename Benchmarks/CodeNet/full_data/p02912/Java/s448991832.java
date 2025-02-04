import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Long> bout = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Long q = Long.parseLong(String.valueOf(in.nextInt()));
            bout.add(q);
        }
        for (int i = 1; i <= m; i++) {
            bout.sort(Comparator.reverseOrder());
            bout.set(0, bout.get(0) / 2);
        }
        Long result = bout.stream().mapToLong(s -> s).sum();
        System.out.println(result);
    }
}
