import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        List<String> list = new ArrayList<>();
        StringBuilder p = new StringBuilder();
        StringBuilder q = new StringBuilder();
        for (int i = 0; i < n; i++) {
            p.append(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < n; i++) {
            q.append(Integer.parseInt(sc.next()));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        nextPermutation(list, sb.toString(), "");
        int a = list.indexOf(p.toString());
        int b = list.indexOf(q.toString());
        System.out.println(Math.abs(a - b));

    }

    private static void nextPermutation(List<String> list, String s, String ans) {
        if (s.length() == 0) {
            list.add(ans);
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                String temp = s.substring(0, i) + s.substring(i + 1);
                nextPermutation(list, temp, ans + c);
            }
        }
    }
}
