import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++){
            ArrayList<Integer> sort = new ArrayList<>();
            sort.addAll(list);
            sort.remove(i);
            Collections.sort(sort, Collections.reverseOrder());
            System.out.println(sort.get(0));
        }
    }
}
