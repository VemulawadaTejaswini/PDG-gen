import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] A = new int[N];

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        };
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(comparator);

        long ans = 0L;
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            ans+=A[i];
            int[] add_array = {A[i]-A[i]/2, A[i]};
            queue.add(add_array);
        }

        while (!queue.isEmpty()) {
            if (M<=0) {
                break;
            }
            // System.out.println(ans);
            int[] rem = queue.remove();
            // System.out.println(Arrays.toString(rem));
            ans-=rem[0];
            int[] add_array = {rem[1]-rem[0]-(rem[1]-rem[0])/2, rem[1]-rem[0]};
            queue.add(add_array);
            M--;
        }
        System.out.println(ans);
    }
}