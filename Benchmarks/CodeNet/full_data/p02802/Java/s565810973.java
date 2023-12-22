import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int countWA = 0;
        Set<Integer> setAC = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();
            if ("AC".equals(s)) {
                setAC.add(p);
            } else {
                if (!setAC.contains(p)) {
                    countWA++;
                }
            }
        }
        System.out.println(setAC.size() +" "+countWA);
    }
}
