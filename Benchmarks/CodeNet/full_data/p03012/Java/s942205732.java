import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] sa = sc.nextLine().split(" ");
        int[] ia = Stream.of(sa).mapToInt(Integer::parseInt).toArray();

        int rs = 0;
        int rb = 0;
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < ia.length; i++) {
           li.add(abs(ia, N, i));
        }

        System.out.println(li.stream().map(Math::abs).sorted().findFirst().get());
    }
    private static int abs(int[] ia, int N, int i) {
        int rs = 0;
        int rb = 0;
        for(int y = 0; y < i+1 ; y++) {
            rs += ia[y];
        }
        for (int k = i+1; k < N; k++) {
            rb += ia[k];
        }
        return rb - rs;
    }
}