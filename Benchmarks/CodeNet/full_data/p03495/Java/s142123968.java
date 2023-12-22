import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] l = new int[200001];
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int ans = 0;
        for(int i = 0; i < N; i++)
            l[Integer.parseInt(sc.next())]++;
            Arrays.sort(l);
        for(int i = 0; i < 200001-K; i++)
            ans += l[i];
        System.out.println(ans);
    }
}
