import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        List<String> a = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            if (s.contains("#")) {
                a.add(s);
            }
        }
        sc.close();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            boolean f = false;
            for (String x : a) {
                if (x.charAt(i) == '#') {
                    f = true;
                    break;
                }
            }
            if (f) {
                b.add(i);
            }
        }
        for (String x : a) {
            for (int i = 0; i < w; i++) {
                if (b.contains(i))
                    System.out.print(x.charAt(i));
            }
            System.out.println();
        }
    }
}