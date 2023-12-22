import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> pList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pList.add(Integer.parseInt(sc.nextLine()));
        }

        pList.sort(Collections.reverseOrder());
        pList.set(0, pList.get(0) / 2);

        int sum = 0;
        for(Integer p: pList) {
            sum += p;
        }

        System.out.println(sum);
    }
}