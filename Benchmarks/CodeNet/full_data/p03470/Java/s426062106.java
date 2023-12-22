import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i=0; i<N; i++) {
            int d = sc.nextInt();
            if (!set.contains(d)) {
                set.add(d);
                ans++;
            }
        }
        System.out.println(ans);
    }
}