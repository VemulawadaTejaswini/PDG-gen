import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String[] str = sc.next().split("");
        int n = Integer.parseInt(sc.next());
        String target = str[n - 1];
        String result = "";
        for (int i = 0; i < a; i++) {
            if (!str[i].equals(target)) {
                str[i] = "*";
            }
            result += str[i];
        }
        System.out.println(result);
    }
}