import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int a[] = new int[3];
        for (int i = 0; i < s.length(); i++) {
            if ("a".equals(s.substring(i, i + 1))) {
                a[0]++;
            } else if ("b".equals(s.substring(i, i + 1))) {
                a[1]++;
            } else {
                a[2]++;
            }
        }
        if (Arrays.stream(a).max().getAsInt() - Arrays.stream(a).min().getAsInt() > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}