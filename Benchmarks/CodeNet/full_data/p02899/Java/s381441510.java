import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> men = new ArrayList<>(n);

        for(int i = 1; i <= n; i++) {
            men.add(999);
        }
        for(int i = 1; i <= n; i++) {
            men.set(sc.nextInt() - 1, i);
        }
        String ans = "";
        for ( int j : men) {
            ans += j + " ";
        }
        System.out.println(ans.trim());
    }

}
