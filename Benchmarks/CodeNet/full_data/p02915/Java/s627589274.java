import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>(); 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    set.add(Integer.toString(i) + Integer.toString(j) + Integer.toString(k));
                }
            }
        }
        System.out.println(set.size());
    }
}
