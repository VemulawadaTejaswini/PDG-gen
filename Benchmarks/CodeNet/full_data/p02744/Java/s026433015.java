import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) continue;
            a *= 2;
        }
        TreeSet<String> set = new TreeSet<>();
        String b;
        for (int i = 0; i < a; i++) {
            b = Integer.toBinaryString(i);
            b = b.replaceAll("0","a").replaceAll("1","b");
            b = String.format("%" + n + "s", b);
            set.add(b.replaceAll(" ","a"));
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}