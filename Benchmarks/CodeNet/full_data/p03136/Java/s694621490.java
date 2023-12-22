import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int sum = 0;
        int max = list.get(n - 1);
        for (int i = 0; i < n - 1; i++) {
            sum += list.get(i);
        }
        if (max < sum) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
