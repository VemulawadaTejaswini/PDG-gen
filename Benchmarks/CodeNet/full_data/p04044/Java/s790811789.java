import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            ary[i] = a;
        }
        Arrays.sort(ary);
        for (String ans : ary) {
            System.out.print(ans);
        }
    }
}