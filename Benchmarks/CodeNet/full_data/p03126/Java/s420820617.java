import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> k = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            k.add(sc.nextInt());
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < k.get(i); j++) {
                list.add(sc.nextInt());
            }
            a.add(list);
        }

        List<Integer> correct = new ArrayList<>(a.get(0));
        for (int i = 1; i < n; i++) {
            correct.retainAll(a.get(i));
        }
        System.out.println(correct.size());
    }

}
