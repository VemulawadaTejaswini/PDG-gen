import java.util.*;

public class Main {

    private static int N, M;
    private static int[] A, B, C;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        B = new int[M];
        C = new int[M];
        for (int i = 0; i < N; i += 1) {
            A[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < M; i += 1) {
            B[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        read();

        List<List<Integer>> XY = new ArrayList<>();
        for (int Ai : A) {
            List<Integer> list = new LinkedList<>();
            list.add(1); list.add(Ai);
            XY.add(list);
        }
        for (int i = 0; i < M; i += 1) {
            List<Integer> list = new LinkedList<>();
            list.add(B[i]); list.add(C[i]);
            XY.add(list);
        }

        Collections.sort(XY, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                Integer Y1 = o1.get(1);
                Integer Y2 = o2.get(1);
                return Y2.compareTo(Y1);
            }
        });

        long max = 0;
        int remaining = N;
        boolean getReturn = false;
        for (List<Integer> xy : XY) {
            int x = xy.get(0);
            int y = xy.get(1);
            for (int i = 0; i < x; i += 1) {
                max += y;
                remaining -= 1;
                if (remaining == 0) {
                    getReturn = true;
                    break;
                }
            }

            if (getReturn) {
                break;
            }
        }

        System.out.println(max);
    }
}
