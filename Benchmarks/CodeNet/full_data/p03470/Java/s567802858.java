import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        Integer n = sc.nextInt();
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        System.out.println(s.size());
        sc.close();
    }
}
