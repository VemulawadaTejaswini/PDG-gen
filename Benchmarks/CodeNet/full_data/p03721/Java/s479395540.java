import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int work = sc.nextInt();
            for (int j = 0; j < work; j++) {
                list.add(num);
            }
        }

        sc.close();

        Collections.sort(list);

        System.out.println(list.get(k - 1));
    }
}