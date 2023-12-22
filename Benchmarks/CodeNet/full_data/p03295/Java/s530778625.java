import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        ArrayList<int[]> bridge = new ArrayList<int[]>();
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        };
        for (int i=0;i<M;i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int[] add = {a, b};
            bridge.add(add);
        }
        Collections.sort(bridge, comparator);

        int cnt = 0;
        int before = -1;
        for (int[] rem : bridge) {
            if (rem[0]<=before) {
                continue;
            } else {
                cnt++;
                before = rem[1]-1;
            }
        }
        System.out.println(cnt);
    }
}