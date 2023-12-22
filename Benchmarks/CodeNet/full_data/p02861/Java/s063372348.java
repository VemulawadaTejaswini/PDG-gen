
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<List<Integer>> o = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        al(N, new ArrayList<Integer>());

        double sum = 0.0;
        for (List<Integer> order : o) {
            for (int oi = 0; oi < order.size() - 1; oi++) {
                int i = order.get(oi);
                int j = order.get(oi+1);
                sum += Math.sqrt((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]));
            }
//            for (Integer i : order) {
//                System.out.print(i);
//            }
//            System.out.println();
        }
        System.out.println(sum / o.size());
    }

    public static void al(int N, ArrayList<Integer> order) {
        if (order.size() == N) {
            o.add(order);
        } else {
            for (int i = 0; i < N; i++) {
                if (!order.contains(Integer.valueOf(i))) {
                    ArrayList<Integer> copy = (ArrayList<Integer>) order.clone();
                    copy.add(i);
                    al(N, copy);
                }
            }
        }
    }
}
