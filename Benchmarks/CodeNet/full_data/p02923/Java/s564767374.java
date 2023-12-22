import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> H = new ArrayList<>();
        for (int i = 0; i < N; i++)
            H.add(sc.nextInt());

        int mv = 0;
        List<Integer> maxMv = new ArrayList<>();

        Collections.reverse(H);

        for (int i = 1; i < H.size(); i++) {
            if (H.get(i - 1) <= H.get(i)) {
                mv++;
            } else {
                maxMv.add(mv);
                mv = 0;
            }
        }

        System.out.println(Collections.max(maxMv));


    }
}