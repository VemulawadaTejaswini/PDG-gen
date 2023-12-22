import java.io.BufferedInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static final int MAX = 1_000_000_000;
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n= sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        String t = sc.next();
        String res = "";
        for (int i = 0; i < n; i++) {
            res += s.charAt(i) + "" + t.charAt(i);
        }
        System.out.println(res);
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("")).mapToInt(Integer::valueOf).toArray();
    }

}