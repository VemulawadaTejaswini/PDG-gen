import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] p = new int[A];
        int[] q = new int[B];
        int[] r = new int[C];
        for (int i = 0; i < A; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < B; i++) {
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < C; i++) {
            r[i] = sc.nextInt();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        List<Integer> list = new ArrayList<>();
        for (int i = A-1; i >= A-X; i--) {
            list.add(p[i]);
        }
        for (int i = B-1; i >= B-Y; i--) {
            list.add(q[i]);
        }
        for (int i = 0; i < C; i++) {
            list.add(r[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        long ans = 0;
        for (int i = 0; i < X+Y; i++) {
            ans += list.get(i);
        }

        System.out.println(ans);
    }
}

