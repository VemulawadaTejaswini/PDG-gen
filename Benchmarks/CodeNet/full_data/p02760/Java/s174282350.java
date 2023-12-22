import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        List<Boolean> R = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(s.next());
            A.add(a);
            R.add(false);
        }
        int N = Integer.parseInt(s.next());
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(s.next());
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) == b) {
                    R.set(j, true);
                }
                if (bingo(R)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    static boolean bingo(List<Boolean> list) {
        return (list.get(0) && list.get(1) && list.get(2)) || (list.get(3) && list.get(4) && list.get(5))
                || (list.get(6) && list.get(7) && list.get(8)) || (list.get(0) && list.get(3) && list.get(6))
                || (list.get(1) && list.get(4) && list.get(7)) || (list.get(2) && list.get(5) && list.get(8))
                || (list.get(0) && list.get(4) && list.get(8)) || (list.get(2) && list.get(4) && list.get(6));
    }
}