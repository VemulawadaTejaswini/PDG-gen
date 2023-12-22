import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i=0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        int abs = Integer.MAX_VALUE;
        for (int T=2; T<= 100; T++) {
            if (T >= list.size()) {
                break;
            }
            List<Integer> s1list = list.subList(0, T);
            List<Integer> s2list = list.subList(T, list.size());
            int s1 = s1list.stream().mapToInt(v -> v).sum();
            int s2 = s2list.stream().mapToInt(v -> v).sum();
            abs = Math.min(abs, Math.abs(s1 - s2));
        }
        System.out.println(abs);
    }
}
