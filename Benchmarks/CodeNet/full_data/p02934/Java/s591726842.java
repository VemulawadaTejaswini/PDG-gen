import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(sc.next()));
            }

            int child = 1;
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int cache = 1;
                for (int j = 0; j < list.size(); j++) {
                    if (i != j) {
                        cache = cache * list.get(j);
                    }
                }
                sum += cache;
                child *= list.get(i);
            }

            System.out.println((double)child / (double)sum);
        }
    }

}
