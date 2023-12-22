import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            b.add(tmp);
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > b.get(i)) ret += a.get(i) - b.get(i);
        }
        System.out.println(ret);
    }
}
