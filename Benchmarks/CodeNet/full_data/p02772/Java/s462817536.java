import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int ax = scanner.nextInt();
            if (ax % 2 == 0) {
                A.add(ax);
            }
        }

        long filteredCount = A.stream().filter((it) -> it % 3 == 0 || it % 5 == 0).count();
        System.out.println(A.size() == filteredCount ? "APPROVED" : "DENIED");
    }
}
