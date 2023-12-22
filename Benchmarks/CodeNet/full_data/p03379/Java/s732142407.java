import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> work = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tmp.add(sc.nextInt());
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            work = (ArrayList<Integer>) tmp.clone();
            work.remove(i);
            Collections.sort(work);
            System.out.println(work.get((n - 1) / 2));
        }
    }
}