import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> x = new ArrayList<Integer>();
        int result = -1;

        for (int i = 0; i<N; i++) {
            x.add(sc.nextInt());
        }

        for (int i = 0; i<N-K+1; i++) {

                int distance = Math.abs(x.get(i)) + Math.abs(x.get(i) - x.get(i+K-1));
                if (result < 0 || result > distance) {
                    result = distance;
                }
                distance = Math.abs(x.get(i)) + Math.abs(x.get(i) - x.get(i+K-1));
                if (result < 0 || result > distance) {
                    result = distance;
                }
        }

        System.out.println(result);
    }
}
