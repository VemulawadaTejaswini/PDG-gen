import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Long[] bout = new Long[n];
        for(int i = 0; i < n; i++){
            Long q = Long.parseLong(String.valueOf(in.nextInt()));
            bout[i] = q;
        }
        Arrays.sort(bout);
        for (int i = 1; i <= m; i++) {
            Arrays.sort(bout);
            bout[bout.length - 1] =
                    bout[bout.length - 1] / 2;
        }
        Long result = Arrays.asList(bout).stream().mapToLong(s -> s).sum();
        System.out.println(result);
    }
}
