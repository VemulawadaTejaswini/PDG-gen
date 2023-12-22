import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        String result = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || (i % 2 == 0)) {
                result += Character.toString(a[i]);
            }
        }
        System.out.println(result);
    }
}
